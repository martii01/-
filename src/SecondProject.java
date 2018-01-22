import java.util.Random;
import java.util.Scanner;

public class SecondProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        //Имена на играчи:

        System.out.println("Кажете си имената играчи!");
        System.out.print("Името на играч 1 е: ");

        String nameOfFirstPlayer = input.nextLine();

        System.out.print("Името на играч 2 е: ");
        String nameOfSecondPlayer = input.nextLine();

        //Без числа и символи

        String regex = "^[а-яА-Я\\s]+$";

        //Числа и резултат
        int score1 = 0;
        int score2 = 0;
        byte mistakes1 = 0;
        byte mistakes2 = 0;
        int number;

        //Континенти
        String europe = "Европа";
        String africa = "Африка";
        String asia = "Азия";
        String northAmerica = "Северна Америка";
        String southAmerica = "Южна Америка";
        String australiaAndOceania = "Австралия и Океания";
        String antarctica = "Антарктида";

        //Държави
        String capital1 = "1";
        String capital2 = "1";
        String capitalsInEurope[][] = {
                {"Русия", "Москва"},
                {"Украйна", "Киев"},
                {"Франция", "Париж"},
                {"Испания", "Мадрид"},
                {"Швеция", "Стокхолм"},
                {"Норвегия", "Осло"},
                {"Германия", "Берлин"},
                {"Финландия", "Хелзинги"},
                {"Полша", "Варшава"},
                {"Италия", "Рим"},
                {"Великобритания", "Лондон"},
                {"Румъния", "Букурещ"},
                {"Беларус", "Минск"},
                {"Гърция", "Атина"},
                {"България", "София"},
                {"Исландия", "Рейкявик"},
                {"Унгария", "Будапеща"},
                {"Португалия", "Лисабон"},
                {"Сърбия", "Белград"},
                {"Азербайджан", "Баку"},
                {"Австрия", "Виена"},
                {"Чехия", "Прага"},
                {"Ирландия", "Дъблин"},
                {"Литва", "Вилнюс"},
                {"Латвия", "Рига"},
                {"Хърватия", "Загреб"},
                {"Босна и Херцеговина", "Сараево"},
                {"Словакия", "Братислава"},
                {"Естония", "Талин"},
                {"Дания", "Копенхаген"},
                {"Нидерландия", "Амстердам"},
                {"Швейцария", "Берн"},
                {"Молдова", "Кишинев"},
                {"Белгия", "Брюксел"},
                {"Албания", "Тирана"},
                {"Македония", "Скопие"},
                {"Турция", "Анкара"},
                {"Словения", "Любляна"},
                {"Черна гора", "Подгорица"},
                {"Кипър", "Никозия"},
                {"Люксембург", "Люксембург"},
                {"Андора", "Андора ла Веля"},
                {"Малта", "Валета"},
                {"Лихтенщайн", "Вадуц"},
                {"Сан Марино", "Сан Марино"},
                {"Монако", "Монако"},
                {"Косово", "Прищина"}
        };

        String capitalsInAfrica[][] = {
                {"Египет", "Кайро"},
                {"Алжир", "Алжир"},
                {"Ангола", "Луанда"},
                {"Бенин", "Порто Ново"},
                {"Ботсвана", "Габороне"},
                {"Буркина Фасо", "Уагадугу"},
                {"Бурунди", "Бужумбура"},
                {"Габон", "Либървил"},
                {"Гамбия", "Банджул"},
                {"Гана", "Акра"},
                {"Гвинея", "Конакри"},
                {"Гвинея-Бисау", "Бисау"},
                {"Демократична република Конго", "Киншаса"},
                {"Джибути", "Джибути"},
                {"Екваториална Гвинея", "Малабо"},
                {"Еритрея", "Асмара"},
                {"Етиопия", "Адис Абеба"},
                {"Замбия", "Лусака"},
                {"Зимбабве", "Хараре"},
                {"Кабо Верде", "Прая"},
                {"Камерун", "Яунде"},
                {"Кения", "Найроби"},
                {"Коморски острови", "Морони"},
                {"Кот д'Ивоар", "Ямусукро"},
                {"Лесото", "Масеру"},
                {"Либерия", "Монровия"},
                {"Либия", "Триполи"},
                {"Мадагаскар", "Антананариву"},
                {"Мавритания", "Нуакшот"},
                {"Мавриций", "Порт Луи"},
                {"Малави", "Лилонгве"},
                {"Мали", "Бамако"},
                {"Мароко", "Рабат"},
                {"Мозамбик", "Мапуто"},
                {"Намибия", "Виндхук"},
                {"Нигер", "Ниамей"},
                {"Нигерия", "Абуджа"},
                {"Конго", "Бразавил"},
                {"Руанда", "Кигали"},
                {"Сао Томе и Принсипи", "Сао Томе"},
                {"Свазиленд", "Мбабане"},
                {"Сейшели", "Виктория"},
                {"Сенегал", "Дакар"},
                {"Сиера Леоне", "Фрийтаун"},
                {"Сомалия", "Могадишу"},
                {"Судан", "Хартум"},
                {"Танзания", "Додома"},
                {"Того", "Ломе"},
                {"Тунис", "Тунис"},
                {"Уганда", "Кампала"},
                {"Централноафриканска република", "Банги"},
                {"Чад", "Нджамена"},
                {"Република Южна Африка", "Претория"},
                {"Южен Судан", "Джуба"},

        };

        String capitalsInAsia[][] = {
                {"Казахстан", "Астана"},
                {"Киргизстан", "Бишкек"},
                {"Таджикистан", "Душанбе"},
                {"Туркменистан", "Ашхабат"},
                {"Узбекистан", "Ташкент"},
                {"Китай", "Пекин"},
                {"Монголия", "Улан Батор"},
                {"Северна Корея", "Пхенян"},
                {"Тайван", "Тайпе"},
                {"Южна Корея", "Сеул"},
                {"Япония", "Токио"},
                {"Русия", "Москва"},
                {"Бруней", "Бандар Сери Бегаван"},
                {"Виетнам", "Ханой"},
                {"Източен Тимор", "Дили"},
                {"Индонезия", "Джакарта"},
                {"Камбоджа", "Пном Пен"},
                {"Лаос", "Виентян"},
                {"Малайзия", "Куала Лумпур"},
                {"Мианмар", "Найпидо"},
                {"Сингапур", "Сингапур"},
                {"Тайланд", "Банкок"},
                {"Филипини", "Манила"},
                {"Афганистан", "Кабул"},
                {"Бангладеш", "Дака"},
                {"Бутан", "Тхимпху"},
                {"Индия", "Делхи"},
                {"Малдиви", "Мале"},
                {"Непал", "Катманду"},
                {"Пакистан", "Исламабад"},
                {"Шри Ланка", "Шри Джаяварданапура Коте"},
                {"Абхазия", "Сухуми"},
                {"Азербайджан", "Баку"},
                {"Армения", "Ереван"},
                {"Бахрейн", "Манама"},
                {"Израел", "Йерусалим"},
                {"Ирак", "Багдад"},
                {"Иран", "Техеран"},
                {"Йемен", "Сана"},
                {"Йордания", "Аман"},
                {"Катар", "Доха"},
                {"Кувейт", "Кувейт"},
                {"Ливан", "Бейрут"},
                {"Нагорни Карабах", "Степанакерт"},
                {"Обединени арабски емирства", "Абу Даби"},
                {"Оман", "Маскат"},
                {"Палестинска автономия", "Рамала"},
                {"Саудитска Арабия", "Рияд"},
                {"Сирия", "Дамаск"},
                {"Турция", "Анкара"},
        };

        String capitalsInNorthAmerica[][] = {
                {"Американски Вирджински острови", "Шарлот Амали"},
                {"Ангуила", "Вали"},
                {"Антигуа и Барбуда", "Сейнт Джонс"},
                {"Гватемала", "Гватемала"},
                {"Барбадос", "Бриджтаун"},
                {"Бахамски острови", "Насау"},
                {"Белиз", "Белмопан"},
                {"Гренада", "Сейнт Джорджис"},
                {"Гренландия", "Нуук"},
                {"Доминика", "Розо"},
                {"Доминиканска република", "Санто Доминго"},
                {"Канада", "Отава"},
                {"Коста Рика", "Сан Хосе"},
                {"Куба", "Хавана"},
                {"Кюрасао", "Филипсбург"},
                {"Мексико", "Мексико"},
                {"Никарагуа", "Манагуа"},
                {"Панама", "Панама"},
                {"Пуерто Рико", "Сан Хуан"},
                {"Салвадор", "Сан Салвадор"},
                {"Сейнт Винсент и Гренадини", "Кингстаун"},
                {"Сейнт Китс и Невис", "Бастер"},
                {"Сейнт Лусия", "Кастрийс"},
                {"Синт Мартен", "Филипсбург"},
                {"Съединени американски щати", "Вашингтон"},
                {"Тринидад и Тобаго", "Порт ъф Спейн"},
                {"Хаити", "Порт о Пренс"},
                {"Хондурас", "Тегусигалпа"},
                {"Ямайка", "Кингстън"},
                {"Аруба", "Оранестад"}
        };

        String capitalsInSouthAmerica[][] = {
                {"Аржентина", "Буенос Айрес"},
                {"Боливия", "Сукре"},
                {"Бразилия", "Бразилия"},
                {"Венецуела", "Каракас"},
                {"Гвиана", "Джорджтаун"},
                {"Еквадор", "Кито"},
                {"Колумбия", "Богота"},
                {"Панама", "Панама"},
                {"Парагвай", "Асунсион"},
                {"Перу", "Лима"},
                {"Суринам", "Парамарибо"},
                {"Уругвай", "Монтевидео"},
                {"Чили", "Сантяго де Чиле"},
        };

        String capitalsInAustraliaAndOceania[][] = {
                {"Австралия", "Канбера"},
                {"Нова Зеландия", "Уелингтън"},
                {"Индонезия", "Джакарта"},
                {"Фиджи", "Сува"},
                {"Нова Каледония", "Нумеа"},
                {"Папуа Нова Гвинея", "Порт Морсби"},
                {"Соломонови острови", "Хониара"},
                {"Вануату", "Порт Вила"},
                {"Микронезия", "Паликир"},
                {"Кирибати", "Южна Тарауа"},
                {"Маршалови острови", "Маджуро"},
                {"Науру", "Ярен"},
                {"Палау", "Мелекеок"},
                {"Самоа", "Апия"},
                {"Тонга", "Нуку'алофа"},
                {"Тувалу", "Фунафути"},
        };

        // Въвеждане на континент и разпознаване, дали има такъв или няма (на кирилица)
        System.out.println("Въведете континент, на който искате да познаете столиците");
        String continent;
        do {
            continent = input.nextLine();
            if (continent.equalsIgnoreCase(antarctica)) {
                System.out.println("Това е континент, но на него няма държави");
                System.out.println("Моля задай друг контитент, написан на кирилица");
            }
            if (!continent.equalsIgnoreCase(europe) && !continent.equalsIgnoreCase(africa) &&
                    !continent.equalsIgnoreCase(asia) && !continent.equalsIgnoreCase(northAmerica) &&
                    !continent.equalsIgnoreCase(southAmerica) && !continent.equalsIgnoreCase(australiaAndOceania)
                    && !continent.equalsIgnoreCase(antarctica)) {
                System.out.println("Това не е континент, написан на кирилица, пробвай пак");
            }

        } while (!continent.equalsIgnoreCase(europe) && !continent.equalsIgnoreCase(africa) &&
                !continent.equalsIgnoreCase(asia) && !continent.equalsIgnoreCase(northAmerica) &&
                !continent.equalsIgnoreCase(southAmerica) && !continent.equalsIgnoreCase(australiaAndOceania));

        //Държави в Европа

        if (continent.equalsIgnoreCase(europe)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInEurope.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInEurope[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInEurope[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInEurope[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }

        //Държави в Африка

        if (continent.equalsIgnoreCase(africa)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInAfrica.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInAfrica[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInAfrica[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInAfrica[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
        //Държави в Азия

        if (continent.equalsIgnoreCase(asia)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInAsia.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInAsia[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInAsia[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInAsia[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }

        //Държави в Северна Америка

        if (continent.equalsIgnoreCase(northAmerica)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInNorthAmerica.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInNorthAmerica[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInNorthAmerica[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInNorthAmerica[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }

        //Държави в Южна Америка

        if (continent.equalsIgnoreCase(southAmerica)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInSouthAmerica.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInSouthAmerica[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInSouthAmerica[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInSouthAmerica[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }

        //Държави в Австралия и Океания

        if (continent.equalsIgnoreCase(australiaAndOceania)) {
            while (mistakes1 != 3 || mistakes2 != 3) {
                number = rand.nextInt(capitalsInAustraliaAndOceania.length);
                System.out.println("Напишете столицата на:");
                System.out.println(capitalsInAustraliaAndOceania[number][0]);
                //Играч 1 въвежда столицата на държавата
                if (mistakes1 != 3) {
                    System.out.println("Ред е на " + nameOfFirstPlayer + "!");
                    do {
                        capital1 = input.nextLine();
                        if (!capital1.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital1.matches(regex));
                }
                //Играч 2 въвежда столицата на държавата
                if (mistakes2 != 3) {
                    System.out.println("Ред е на " + nameOfSecondPlayer + "!");
                    do {
                        capital2 = input.nextLine();
                        if (!capital2.matches(regex)) {
                            System.out.println("Използвай букви (кирилица)");
                        }
                    } while (!capital2.matches(regex));
                }
                //Проверка на точките на играч 1!
                if (mistakes1 != 3) {
                    if (capitalsInAustraliaAndOceania[number][1].equalsIgnoreCase(capital1)) {
                        score1++;
                        System.out.println("Верен отговор за " + nameOfFirstPlayer + " !");
                        System.out.println("Точките на " + nameOfFirstPlayer + " са: " + score1);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes1++;
                        System.out.println("Грешен отговор за " + nameOfFirstPlayer + "!");
                        if (mistakes1 == 1) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 2) {
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живот");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 2!
                if (mistakes2 != 3) {
                    if (capitalsInAustraliaAndOceania[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 2!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes2) + " живот");
                            System.out.println("");
                        }
                        if (mistakes2 == 3) {
                            System.out.println(nameOfSecondPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
            }
        }

        //краен резултат:
        System.out.println("Крайните точки на " + nameOfFirstPlayer + " са: " + score1);
        System.out.println("Крайните точки на " + nameOfSecondPlayer + " са: " + score2);

        if (score1 > score2) {
            System.out.println(nameOfFirstPlayer + " печели!");
        }
        if (score1 == score2) {
            System.out.println("Играчите са равни!");
        }
        if (score1 < score2) {
            System.out.println(nameOfSecondPlayer + " печели!");
        }
    }
}

