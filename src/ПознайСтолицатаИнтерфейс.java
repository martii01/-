import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class ПознайСтолицатаИнтерфейс extends Application {

    Stage window;
    Scene continentScene, europeScene, asiaScene, africaScene, northAmericaScene, southAmericaScene,
            australiaAndOceaniaScene;
    TextField capital1, capital2;
    Label player1, player2, live1, live2, score1, score2, country, messageForAllCountries;
    GridPane europeGridPane, asiaGridPane, africaGridPane, northAmericaGridPane, southAmericaGridPane,
            australiaAndOceaniaGridPane;


    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
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

        playersButton.setOnAction(e -> System.out.println("Името на играч 1 е: " + nameOfPlayerOne.getText() +
                '\n' + "Името на играч 2 е: " + nameOfPlayerTwo.getText()));

        //Button to continue to another window:
        Button continueButton = new Button("Продължете :)");
        GridPane.setConstraints(continueButton, 1, 6);

        continueButton.setOnAction(e -> window.setScene(continentScene));

        //Showing the first window
        StartingGridPane.getChildren().addAll(inputMessage, playerOneMessage, nameOfPlayerOne,
                playerTwoMessage, nameOfPlayerTwo, continueButton, playersButton);

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
        europeGridPane = new GridPane();
        europeGridPane.setPadding(new Insets(10, 10, 10, 10));
        europeGridPane.setVgap(8);
        europeGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        europeGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        europeScene = new Scene(europeGridPane, 600, 800);
//Ending the Europe window
//Starting the Asia window
        asiaGridPane = new GridPane();
        asiaGridPane.setPadding(new Insets(10, 10, 10, 10));
        asiaGridPane.setVgap(8);
        asiaGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        asiaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        asiaScene = new Scene(asiaGridPane, 600, 800);
//Ending the Asia window
//Starting the Africa window
        africaGridPane = new GridPane();
        africaGridPane.setPadding(new Insets(10, 10, 10, 10));
        africaGridPane.setVgap(8);
        africaGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        africaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        africaScene = new Scene(africaGridPane, 600, 800);
//Ending the Africa window
// Starting the North America window
        northAmericaGridPane = new GridPane();
        northAmericaGridPane.setPadding(new Insets(10, 10, 10, 10));
        northAmericaGridPane.setVgap(8);
        northAmericaGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        northAmericaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        northAmericaScene = new Scene(northAmericaGridPane, 600, 800);
//Ending the North America window
// Starting the South America window
        southAmericaGridPane = new GridPane();
        southAmericaGridPane.setPadding(new Insets(10, 10, 10, 10));
        southAmericaGridPane.setVgap(8);
        southAmericaGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        southAmericaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        southAmericaScene = new Scene(southAmericaGridPane, 600, 800);
//Ending the Africa window
// Starting the Africa window
        australiaAndOceaniaGridPane = new GridPane();
        australiaAndOceaniaGridPane.setPadding(new Insets(10, 10, 10, 10));
        australiaAndOceaniaGridPane.setVgap(8);
        australiaAndOceaniaGridPane.setHgap(12);

        //Съобщение до всички играчи
        messageForAllCountries = new Label("Държавата, която трябва да познаете е:");
        GridPane.setConstraints(messageForAllCountries, 0, 0);

        //Познаване на столицата
        country = new Label("");
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
        score1.setText("Точки на 1 играч са: ");
        GridPane.setConstraints(score1, 0, 10);

        //Точки на играч 2:
        score2 = new Label();
        score2.setText("Точки на 2 играч са: ");
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
        live1.setText("Животите на 1 играч са: ");
        GridPane.setConstraints(live1, 0, 8);

        //Животи на играч 2:
        live2 = new Label();
        live2.setText("Животите на 2 играч са: ");
        GridPane.setConstraints(live2, 2, 8);

        //Showing the Europe window:
        australiaAndOceaniaGridPane.getChildren().addAll(messageForAllCountries, player1, player2, score1, score2, country,
                capital1, capital2, live1, live2);

        australiaAndOceaniaScene = new Scene(australiaAndOceaniaGridPane, 600, 800);
//Ending the Australia and Oceania window
        window.setScene(inputNamesScene);
        window.show();
    }
}
