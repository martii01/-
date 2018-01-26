import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class ПознайСтолицатаИнтерфейс extends Application {

    Stage window;
    Scene continentScene, europeScene, asiaScene, africaScene, northAmericaScene, southAmericaScene,
            australiaAndOceaniaScene;
    TextField capital1, capital2;
    Label player1, player2, live1, live2, score1, score2, country, messageForAllCountries;
    GridPane europeGridPane, asiaGridPane, africaGridPane, northAmericaGridPane, southAmericaGridPane,
            australiaAndOceaniaGridPane;
    Button checkingEurope, checkingAsia, checkingAfrica, checkingNorthAmerica, checkingSouthAmerica,
            checkingAustraliaAndOceania;


    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Random rand = new Random();
        int mistakesOfPlayer1 = 0;
        int mistakesOfPlayer2 = 0;
        int scoreOfPlayer1 = 0;
        int scoreOfPlayer2 = 0;
        int numberForEurope;
        int numberForAsia;
        int numberForAfrica;
        int numberForNorthAmerica;
        int numberForSouthAmerica;
        int numberForAustraliaAndOceania;

        window = primaryStage;
        window.setTitle("Познай столицата");
//Starting the first window!
        //GridPane with 10px padding around edge
        GridPane StartingGridPane = new GridPane();
        StartingGridPane.setPadding(new Insets(10, 10, 10, 10));
        StartingGridPane.setVgap(8);
        StartingGridPane.setHgap(12);

        Label inputMessage = new Label("Здравейте играчи, моля въведете имената си!");
        GridPane.setConstraints(inputMessage, 0, 0);

        //Message for player 1:
        Label playerOneMessage = new Label("Играч 1");
        GridPane.setConstraints(playerOneMessage, 1, 3);

        //Name of player 1 input:
        TextField nameOfPlayerOne = new TextField("Играч 1");
        GridPane.setConstraints(nameOfPlayerOne, 0, 3);

        //Message for player 2:
        Label playerTwoMessage = new Label("Играч 2");
        GridPane.setConstraints(playerTwoMessage, 1, 4);

        //Name of player 2 input:
        TextField nameOfPlayerTwo = new TextField("Играч 2");
        GridPane.setConstraints(nameOfPlayerTwo, 0, 4);

        //Button for the names of the Players:
        Button playersButton = new Button("Играчите са:");
        GridPane.setConstraints(playersButton, 0, 6);

        //Button to continue to another window:
        Button continueButton = new Button("Продължете :)");
        GridPane.setConstraints(continueButton, 1, 6);

        continueButton.setOnAction(e -> {
            System.out.println("Името на играч 1 е: " + nameOfPlayerOne.getText() +
                    '\n' + "Името на играч 2 е: " + nameOfPlayerTwo.getText());
            window.setScene(continentScene);
        });

        //Showing the first window
        StartingGridPane.getChildren().addAll(inputMessage, playerOneMessage, nameOfPlayerOne,
                playerTwoMessage, nameOfPlayerTwo, continueButton);

        Scene inputNamesScene = new Scene(StartingGridPane, 485, 200);
//Ending the first window
//Starting the second window

        GridPane choosingTheContinentGridPane = new GridPane();
        choosingTheContinentGridPane.setPadding(new Insets(10, 10, 10, 10));
        choosingTheContinentGridPane.setVgap(8);
        choosingTheContinentGridPane.setHgap(12);

        //Избиране на континент за игра:
        Label chooseAContinent = new Label("Моля изберете континент за игра!");
        GridPane.setConstraints(inputMessage, 0, 0);

        //Бутон Европа:
        Button buttonEurope = new Button("Европа");
        GridPane.setConstraints(buttonEurope, 0, 1);

        buttonEurope.setOnAction(e -> window.setScene(europeScene));

        //Бутон Азия:
        Button buttonAsia = new Button("Азия");
        GridPane.setConstraints(buttonAsia, 1, 1);

        buttonAsia.setOnAction(e -> window.setScene(asiaScene));

        //Бутон Африка:
        Button buttonAfrica = new Button("Африка");
        GridPane.setConstraints(buttonAfrica, 2, 1);

        buttonAfrica.setOnAction(e -> window.setScene(africaScene));

        //Бутон Северна Америка:
        Button buttonNorthAmerica = new Button("Северна Америка");
        GridPane.setConstraints(buttonNorthAmerica, 0, 2);

        buttonNorthAmerica.setOnAction(e -> window.setScene(northAmericaScene));

        //Бутон Южна Америка:
        Button buttonSouthAmerica = new Button("Южна Америка");
        GridPane.setConstraints(buttonSouthAmerica, 1, 2);

        buttonSouthAmerica.setOnAction(e -> window.setScene(southAmericaScene));

        //Бутон Австралия и Океания:
        Button buttonAustraliaAndOceania = new Button("Австралия и Океания");
        GridPane.setConstraints(buttonAustraliaAndOceania, 2, 2);

        buttonAustraliaAndOceania.setOnAction(e -> window.setScene(australiaAndOceaniaScene));

        //Showing the second window:
        choosingTheContinentGridPane.getChildren().addAll(chooseAContinent, buttonEurope, buttonAsia,
                buttonAfrica, buttonNorthAmerica, buttonSouthAmerica, buttonAustraliaAndOceania);

        continentScene = new Scene(choosingTheContinentGridPane, 590, 130);
//Ending the second window

//Starting the Europe window

        java.lang.String capitalsInEurope[][] = {
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

        europeGridPane = new GridPane();
        europeGridPane.setPadding(new Insets(10, 10, 10, 10));
        europeGridPane.setVgap(8);
        europeGridPane.setHgap(12);

        //Бутон за проверка
        checkingEurope = new Button("Проверка");
        GridPane.setConstraints(checkingEurope, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата

        while (mistakesOfPlayer1 != 3 || mistakesOfPlayer2 != 3) {
            numberForEurope = rand.nextInt(capitalsInEurope.length - 1);
            country = new Label(capitalsInEurope[numberForEurope][0]);
            GridPane.setConstraints(country, 1, 0);
            if (capitalsInEurope[capitalsInEurope.length - 1][1].equalsIgnoreCase(java.lang.String
                    .valueOf(capital1))) {
                scoreOfPlayer1++;
            } else {
                mistakesOfPlayer1++;
            }
            if (capitalsInEurope[capitalsInEurope.length - 1][1].equalsIgnoreCase(java.lang.String
                    .valueOf(capital2))) {
                scoreOfPlayer2++;
            } else {
                mistakesOfPlayer2++;
            }

        }


        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer1);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        europeGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingEurope);

        europeScene = new Scene(europeGridPane, 585, 265);
//Ending the Europe window
//Starting the Asia window

        java.lang.String capitalsInAsia[][] = {
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
        asiaGridPane = new GridPane();
        asiaGridPane.setPadding(new Insets(10, 10, 10, 10));
        asiaGridPane.setVgap(8);
        asiaGridPane.setHgap(12);

        //Бутон за проверка
        checkingAsia = new Button("Проверка");
        GridPane.setConstraints(checkingAsia, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label(capitalsInAsia[capitalsInAsia.length - 1][0]);

        GridPane.setConstraints(country, 1, 0);

        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer1);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        asiaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingAsia);

        asiaScene = new Scene(asiaGridPane, 585, 265);
//Ending the Asia window
//Starting the Africa window

        java.lang.String capitalsInAfrica[][] = {
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
        africaGridPane = new GridPane();
        africaGridPane.setPadding(new Insets(10, 10, 10, 10));
        africaGridPane.setVgap(8);
        africaGridPane.setHgap(12);

        //Бутон за проверка
        checkingAfrica = new Button("Проверка");
        GridPane.setConstraints(checkingAfrica, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label(capitalsInAfrica[capitalsInAfrica.length - 1][0]);
        GridPane.setConstraints(country, 1, 0);

        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer1);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        africaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingAfrica);

        africaScene = new Scene(africaGridPane, 585, 265);
//Ending the Africa window
// Starting the North America window

        java.lang.String capitalsInNorthAmerica[][] = {
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
        northAmericaGridPane = new GridPane();
        northAmericaGridPane.setPadding(new Insets(10, 10, 10, 10));
        northAmericaGridPane.setVgap(8);
        northAmericaGridPane.setHgap(12);

        //Бутон за проверка
        checkingNorthAmerica = new Button("Проверка");
        GridPane.setConstraints(checkingNorthAmerica, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label(capitalsInNorthAmerica[capitalsInNorthAmerica.length - 1][0]);
        GridPane.setConstraints(country, 1, 0);

        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer1);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        northAmericaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingNorthAmerica);

        northAmericaScene = new Scene(northAmericaGridPane, 585, 265);
//Ending the North America window
// Starting the South America window

        java.lang.String capitalsInSouthAmerica[][] = {
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
        southAmericaGridPane = new GridPane();
        southAmericaGridPane.setPadding(new Insets(10, 10, 10, 10));
        southAmericaGridPane.setVgap(8);
        southAmericaGridPane.setHgap(12);

        //Бутон за проверка
        checkingSouthAmerica = new Button("Проверка");
        GridPane.setConstraints(checkingSouthAmerica, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label(capitalsInSouthAmerica[capitalsInSouthAmerica.length - 1][0]);
        GridPane.setConstraints(country, 1, 0);

        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer1);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        southAmericaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingSouthAmerica);

        southAmericaScene = new Scene(southAmericaGridPane, 585, 265);
//Ending the Africa window
// Starting the AustraliaAndOceania window

        java.lang.String capitalsInAustraliaAndOceania[][] = {
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
        australiaAndOceaniaGridPane = new GridPane();
        australiaAndOceaniaGridPane.setPadding(new Insets(10, 10, 10, 10));
        australiaAndOceaniaGridPane.setVgap(8);
        australiaAndOceaniaGridPane.setHgap(12);

        //Бутон за проверка
        checkingAustraliaAndOceania = new Button("Проверка");
        GridPane.setConstraints(checkingAustraliaAndOceania, 0, 12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label(capitalsInAustraliaAndOceania[capitalsInAustraliaAndOceania.length - 1][0]);
        GridPane.setConstraints(country, 1, 0);

        //Играч 1:
        player1 = new Label();
        player1.textProperty().bind(nameOfPlayerOne.textProperty());
        GridPane.setConstraints(player1, 0, 3);

        //Играч 2:
        player2 = new Label();
        player2.textProperty().bind(nameOfPlayerTwo.textProperty());
        GridPane.setConstraints(player2, 2, 3);

        //Точки на играч 1:
        score1 = new Label();
        score1.setText("Точки: " + scoreOfPlayer1);
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки: " + scoreOfPlayer2);
        GridPane.setConstraints(score2, 2, 10);

        //TextField for capital1
        capital1 = new TextField();
        capital1.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital1, 0, 5);

        //TextField for capital2
        capital2 = new TextField();
        capital2.setPromptText("Напишете столицата на:");
        GridPane.setConstraints(capital2, 2, 5);

        //Животи на играч 1:
        live1 = new Label();
        live1.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Грешки: " + mistakesOfPlayer2);
        GridPane.setConstraints(live2, 2, 8);

        //Showing the AustraliaAndOceania window:
        australiaAndOceaniaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2, checkingAustraliaAndOceania);

        australiaAndOceaniaScene = new Scene(australiaAndOceaniaGridPane, 585, 265);
//Ending the Australia and Oceania window
        window.setScene(inputNamesScene);
        window.show();
    }
}
