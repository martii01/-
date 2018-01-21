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

        //Държави
        String europe = "Европа";
        String africa = "Африка";
        String asia = "Азия";
        String northAmerica = "Северна Америка";
        String southAmerica = "Южна Америка";
        String australiaAndOceania = "Австралия и Океания";

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

        // Въвеждане на континент и разпознаване, дали има такъв или няма (на кирилица)
        System.out.println("Въведете континент, на който искате да познаете столиците");
        String continent;
        do {
            continent = input.nextLine();
            if (!continent.equalsIgnoreCase(europe) && !continent.equalsIgnoreCase(africa) &&
                    !continent.equalsIgnoreCase(asia)) {
                System.out.println("Това не е континент, написан на кирилица, пробвай пак");
            }

        } while (!continent.equalsIgnoreCase(europe) && !continent.equalsIgnoreCase(africa) &&
                !continent.equalsIgnoreCase(asia));

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
                //Играч 1 въвежда столицата на държавата
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
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 1!
                if (mistakes2 != 3) {
                    if (capitalsInEurope[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
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
                //Играч 1 въвежда столицата на държавата
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
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 1!
                if (mistakes2 != 3) {
                    if (capitalsInAfrica[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
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
                //Играч 1 въвежда столицата на държавата
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
                            System.out.println(nameOfFirstPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes1 == 3) {
                            System.out.println(nameOfFirstPlayer + " няма останали животи!");
                            System.out.println(" ");
                        }
                    }
                }
                //Проверка на точките на играч 1!
                if (mistakes2 != 3) {
                    if (capitalsInAsia[number][1].equalsIgnoreCase(capital2)) {
                        score2++;
                        System.out.println("Верен отговор за " + nameOfSecondPlayer + "!");
                        System.out.println("Точките на " + nameOfSecondPlayer + " са: " + score2);
                        System.out.println("");
                    }
                    //Проверка на животите на играч 1!
                    else {
                        mistakes2++;
                        System.out.println("Грешен отговор за " + nameOfSecondPlayer + "!");
                        if (mistakes2 == 1) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
                            System.out.println("");
                        }
                        if (mistakes2 == 2) {
                            System.out.println(nameOfSecondPlayer + " има още " + (3 - mistakes1) + " живота");
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
    }
}

