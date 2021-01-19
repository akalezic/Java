import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class TeaRecommenderGUI extends Application {
// Creates the scene objects that are selected based on user's choice of caffeine level
Scene caffeineScene, highCaffeine, mediumCaffeine, lowCaffeine, noCaffeine;

/* Creates the scene objects that are selected based on user's choice of traditional or
   flavored under each caffeine level */
Scene highCafTrad, highCafFlav, medCafTrad, medCafFlav, lowCafTrad, lowCafFlav, 
herbal, rooibos, blackTeas, strongBlackTeas, mildBlackTeas, fruityBlackTeas, Dessert, 
Matcha, spicedBlackTeas, smokyMedCaf, vegMedCaf, floralMedCafFlavored, fruityMedCaf;

//Repeated statement that it was easier to make  string than copy paste 20 times
String click = "Click to create a personalized file with your recommendation \n" + 
		"called 'Your Tea Recommendation.txt':";

	//Creates stage object
	@Override
	public void start(Stage primaryStage) throws IOException {
		//layout for each scene
		GridPane gridPane = null;
		gridPane = new GridPane();  
		gridPane.setPrefSize(500, 300);
		// sets the vertical spacing between each row for the gridpanes
	    gridPane.setVgap(10); 
	    // All elements in a grid pane will be centered
	    gridPane.setAlignment(Pos.CENTER);
	    // sets the program name to Tea Recommender
		primaryStage.setTitle("Tea Recommender");
		
		//Caffeine Content Scene
		Label intro= new Label("Answer the following questions to get the perfect tea for you:");
		Label caffeineQuestion = new Label("How much caffeine would you like?");
		//Button creates a button that the user can click in order to get to the next set of options
		Button button1= new Button("High");
		/* Sets the action that clicking the button causes, in this case, setting the scene
		to the next scene with the next question and set of button options */
		button1.setOnAction(e -> primaryStage.setScene(highCaffeine)); 
		Button button2 = new Button("Medium");
		button2.setOnAction(e -> primaryStage.setScene(mediumCaffeine));
		Button button3 = new Button("Low");
		button3.setOnAction(e -> primaryStage.setScene(lowCaffeine));
		Button button4 = new Button("None");
		button4.setOnAction(e -> primaryStage.setScene(noCaffeine));
		// Adds each item in specific parts of the grid pane
		gridPane.add(intro, 0, 0);  
		gridPane.add(caffeineQuestion, 0, 1);
		gridPane.add(button1, 0, 2);
		gridPane.add(button2, 0, 3);
		gridPane.add(button3, 0, 4);
		gridPane.add(button4, 0, 5);
		// Creates the scene with the layout specified for that gridpane
		caffeineScene = new Scene(gridPane);
		
		//highCaffeine Scene
		GridPane gridPane1 = null;
		gridPane1 = new GridPane();
		gridPane1.setAlignment(Pos.CENTER);
		gridPane1.setPrefSize(500, 300);
		gridPane1.setVgap(10); 
		Label hcType = new Label("Would you like a traditional or flavored tea?");
		Button hcTrad = new Button("Traditional");
		hcTrad.setOnAction(e -> primaryStage.setScene(highCafTrad));
		Button hcFlav = new Button("Flavored");
		hcFlav.setOnAction(e -> primaryStage.setScene(highCafFlav));
		gridPane1.add(hcType, 0, 0);
		gridPane1.add(hcTrad, 0, 1);
		gridPane1.add(hcFlav, 0, 2);
		highCaffeine = new Scene(gridPane1);
		
		//mediumCaffeine Scene
		GridPane gridPane2 = null;
		gridPane2 = new GridPane();
		gridPane2.setAlignment(Pos.CENTER);
		gridPane2.setPrefSize(500, 300);
		gridPane2.setVgap(10); 
		Label mcType = new Label("Would you like a traditional or flavored tea?");
		Button mcTrad = new Button("Traditional");
		mcTrad.setOnAction(e -> primaryStage.setScene(medCafTrad));
		Button mcFlav = new Button("Flavored");
		mcFlav.setOnAction(e -> primaryStage.setScene(medCafFlav));
		gridPane2.add(mcType, 0, 0);
		gridPane2.add(mcTrad, 0, 1);
		gridPane2.add(mcFlav, 0, 2);
		mediumCaffeine = new Scene(gridPane2);
		
		//lowCaffeine Scene
		GridPane gridPane3 = null;
		gridPane3 = new GridPane();
		gridPane3.setAlignment(Pos.CENTER);
		gridPane3.setPrefSize(500, 300);
		gridPane3.setVgap(10); 
		Label lcType = new Label("Would you like a traditional or flavored tea?");
		Button lcTrad = new Button("Traditional");
		lcTrad.setOnAction(e -> primaryStage.setScene(lowCafTrad));
		Button lcFlav = new Button("Flavored");
		lcFlav.setOnAction(e -> primaryStage.setScene(lowCafFlav));
		gridPane3.add(lcType, 0, 0);
		gridPane3.add(lcTrad, 0, 1);
		gridPane3.add(lcFlav, 0, 2);
		lowCaffeine = new Scene(gridPane3);
		
		//noCaffeine Scene
		GridPane gridPane4 = null;
		gridPane4 = new GridPane();
		gridPane4.setAlignment(Pos.CENTER);
		gridPane4.setPrefSize(500, 300);
		gridPane4.setVgap(10); 
		Label ncType = new Label("Would you like a traditional herbal or something unusual?");
		Button herbTrad = new Button("Traditional");
		herbTrad.setOnAction(e -> primaryStage.setScene(herbal));
		Button unusual = new Button("Unusual");
		unusual.setOnAction(e -> primaryStage.setScene(rooibos));
		gridPane4.add(ncType, 0, 0);
		gridPane4.add(herbTrad, 0, 1);
		gridPane4.add(unusual, 0, 2);
		noCaffeine = new Scene(gridPane4);
		
		//Traditional High Caffeine Scene
		GridPane gridPane5 = null;
		gridPane5 = new GridPane();
		gridPane5.setAlignment(Pos.CENTER);
		gridPane5.setPrefSize(500, 300);
		gridPane5.setVgap(10); 
		Label highCafType = new Label("Would you like a green or black tea?");
		Button hcGreen = new Button("Green");
		hcGreen.setOnAction(e -> primaryStage.setScene(Matcha)); 
		Button black = new Button("Black");
		black.setOnAction(e -> primaryStage.setScene(blackTeas));
		gridPane5.add(highCafType, 0, 0);
		gridPane5.add(hcGreen, 0, 1);
		gridPane5.add(black, 0, 2);
		highCafTrad = new Scene(gridPane5);
	
		
		//Black Traditional Scene
		GridPane gridPane6 = null;
		gridPane6 = new GridPane();
		gridPane6.setAlignment(Pos.CENTER);
		gridPane6.setPrefSize(500, 300);
		gridPane6.setVgap(10);
		Label tradBlack = new Label("Would you prefer a stronger black tea or a milder one?");
		Button strongBlack = new Button("Strong");
		strongBlack.setOnAction(e -> primaryStage.setScene(strongBlackTeas));
		Button mildBlack = new Button("Mild");
		mildBlack.setOnAction(e -> primaryStage.setScene(mildBlackTeas));
		gridPane6.add(tradBlack, 0, 0);
		gridPane6.add(strongBlack, 0, 1);
		gridPane6.add(mildBlack, 0, 2);
		blackTeas = new Scene(gridPane6);
				
		//strongBlackTeas Scene
		GridPane gridPane7 = null;
		gridPane7 = new GridPane();
		gridPane7.setAlignment(Pos.CENTER);
		gridPane7.setPrefSize(500, 300);
		gridPane7.setVgap(10);
		Label teaRec = new Label(click);
		gridPane7.add(teaRec, 0,0);
		Button openFile = new Button("Generate");
		/* The action connected to this button calls the writeTeaRec method, which uses a 
		BufferedReader to write the parameter text into a file */
		openFile.setOnAction(e -> writeTeaRec("Based on your preferences you should have a strong black tea"
				+ "\nSuch as: Assam\nEnglish Breakfast\nIrish Breakfast\nPu-erh"
				+ "\nLapsang Souchong"));
		gridPane7.add(openFile, 0, 1);
		strongBlackTeas = new Scene(gridPane7);
				
				
		//mildBlackTeas Scene
		GridPane gridPane8 = null;
		gridPane8 = new GridPane();
		gridPane8.setAlignment(Pos.CENTER);
		gridPane8.setPrefSize(500, 300);
		gridPane8.setVgap(10);
		Label teaRec1 = new Label(click);
		Button openFile1 = new Button("Generate");
		openFile1.setOnAction(e -> writeTeaRec("Based on your preferences you should have a mild "
				+ "black tea "
				+ "\nSuch as: Darjeeling\nNepalese Black Tea\nChina Golden Yunnan"
				+ "\nCeylon\nColombian Black Tea"));
		gridPane8.add(teaRec1, 0, 0);
		gridPane8.add(openFile1, 0, 1);
		mildBlackTeas = new Scene(gridPane8);		
				
		//Flavored Black Teas Scene
		GridPane gridPane9 = null;
		gridPane9 = new GridPane();
		gridPane9.setAlignment(Pos.CENTER);
		gridPane9.setPrefSize(500, 300);
		gridPane9.setVgap(10); 
		Label blackFlav = new Label("Would you like a fruity, spiced, or dessert black tea?");
		Button fruityBlack = new Button("Fruity");
		fruityBlack.setOnAction(e -> primaryStage.setScene(fruityBlackTeas));
		Button spicedBlack = new Button("Spiced");
		spicedBlack.setOnAction(e -> primaryStage.setScene(spicedBlackTeas));
		Button dessertyBlack = new Button("Dessert");
		dessertyBlack.setOnAction(e -> primaryStage.setScene(Dessert));
		gridPane9.add(blackFlav, 0, 0);
		gridPane9.add(fruityBlack, 0, 1);
		gridPane9.add(spicedBlack, 0, 2);
		gridPane9.add(dessertyBlack, 0, 3);
		highCafFlav = new Scene(gridPane9);
		
		//Matcha Scene
		GridPane gridPane10 = null;
		gridPane10 = new GridPane();
		gridPane10.setAlignment(Pos.CENTER);
		gridPane10.setPrefSize(500, 300);
		gridPane10.setVgap(10);
		Label teaRec5 = new Label(click);
		gridPane10.add(teaRec5, 0,0);
		Button openFile2 = new Button("Generate");
		openFile2.setOnAction(e -> writeTeaRec("Based on your preferences you should have a "
				+ "green tea with high caffeine"
				+ "\nSuch as: Matcha\nJapanese Gyokuro"));
		gridPane10.add(openFile2, 0, 1);
		Matcha = new Scene(gridPane10);
		
		
		//Dessert Black Tea Scene
		GridPane gridPane11 = null;
		gridPane11 = new GridPane();
		gridPane11.setAlignment(Pos.CENTER);
		gridPane11.setPrefSize(500, 300);
		gridPane11.setVgap(10);
		Label teaRec6 = new Label(click);
		gridPane11.add(teaRec6, 0,0);
		Button openFile3 = new Button("Generate");
		openFile3.setOnAction(e -> writeTeaRec("Based on your preferences you should have a creamy, "
				+ "sweet black tea"
				+ "\nSuch as: Coconut Black Tea\nCaramel Black Tea"));
		gridPane11.add(openFile3, 0, 1);
		Dessert = new Scene(gridPane11);
		
		//Fruity Black Teas Scene
		GridPane gridPane12 = null;
		gridPane12 = new GridPane();
		gridPane12.setAlignment(Pos.CENTER);
		gridPane12.setPrefSize(500, 300);
		gridPane12.setVgap(10);
		Label teaRec7 = new Label(click);
		gridPane12.add(teaRec7, 0,0);
		Button openFile4 = new Button("Generate");
		openFile4.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a fruity black tea"
				+ "\nSuch as: Pineapple Mango Black Tea\n"
				+ "Earl Grey\nEarl Grey Lavender\nPeach Black Tea\nMango Black Tea"
				+ "\nLady Grey"));
		gridPane12.add(openFile4, 0, 1);
		fruityBlackTeas = new Scene(gridPane12);
		
		//Spiced Black Teas Scene
		GridPane gridPane13 = null;
		gridPane13 = new GridPane();
		gridPane13.setAlignment(Pos.CENTER);
		gridPane13.setPrefSize(500, 300);
		gridPane13.setVgap(10);
		Label teaRec8 = new Label(click);
		gridPane13.add(teaRec8, 0,0);
		Button openFile5 = new Button("Generate");
		openFile5.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a spiced black tea \nSuch as: Chai\nApple Pie Black Tea"
				+ "\nGinger Black Tea"));
		gridPane13.add(openFile5, 0, 1);
		spicedBlackTeas = new Scene(gridPane13);
		
		// Medium Caffeine Traditional Scene
		GridPane gridPane14 = null;
		gridPane14 = new GridPane();
		gridPane14.setAlignment(Pos.CENTER);
		gridPane14.setPrefSize(500, 300);
		gridPane14.setVgap(10);
		Label medCafTradNotes  = new Label("Would you prefer more smoky notes or more grassy,"
				+ "vegetable-like notes?");
		Button smokyMedTrad = new Button("Smoky");
		smokyMedTrad.setOnAction(e -> primaryStage.setScene(smokyMedCaf));
		Button vegetalMedTrad = new Button("Grassy/vegetal");
		vegetalMedTrad.setOnAction(e -> primaryStage.setScene(vegMedCaf));
		gridPane14.add(medCafTradNotes, 0, 0);
		gridPane14.add(smokyMedTrad, 0, 1);
		gridPane14.add(vegetalMedTrad, 0, 2);
		medCafTrad = new Scene(gridPane14);
		
		//Medium Caffeine Flavored Scene
		GridPane gridPane15 = null;
		gridPane15 = new GridPane();
		gridPane15.setAlignment(Pos.CENTER);
		gridPane15.setPrefSize(500, 300);
		gridPane15.setVgap(10);
		Label medCafFlavNotes  = new Label("Would you prefer a floral or fruity tea?");
		Button floralMedFlav = new Button("Floral");
		floralMedFlav.setOnAction(e -> primaryStage.setScene(floralMedCafFlavored));
		Button fruityMedFlav = new Button("Fruity");
		fruityMedFlav.setOnAction(e -> primaryStage.setScene(fruityMedCaf));
		gridPane15.add(medCafFlavNotes, 0, 0);
		gridPane15.add(floralMedFlav, 0, 1);
		gridPane15.add(fruityMedFlav, 0, 2);
		medCafFlav = new Scene(gridPane15);
		
		//Smoky Traditional Medium Caffeine Scene
		GridPane gridPane16 = null;
		gridPane16 = new GridPane();
		gridPane16.setAlignment(Pos.CENTER);
		gridPane16.setPrefSize(500, 300);
		gridPane16.setVgap(10);
		Label teaRec9 = new Label(click);
		gridPane16.add(teaRec9, 0,0);
		Button openFile6 = new Button("Generate");
		openFile6.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a traditional green tea with smoky notes \n"
				+ "Such as: Japan Genmaicha\nChina Gunpowder\nChina Dragonwell/Lung Ching"
				+ "\nDarjeeling Green Tea"
				+ "\nYou might also be interested in a darker, more oxidized Oolong\n"
				+ "Such as: Formosa Oolong"));
		gridPane16.add(openFile6, 0, 1);
		smokyMedCaf = new Scene(gridPane16);
		
		//Vegetal Traditional Medium Caffeine Scene
		GridPane gridPane17 = null;
		gridPane17 = new GridPane();
		gridPane17.setAlignment(Pos.CENTER);
		gridPane17.setPrefSize(500, 300);
		gridPane17.setVgap(10);
		Label teaRec10 = new Label(click);
		gridPane17.add(teaRec10, 0,0);
		Button openFile7 = new Button("Generate");
		openFile7.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a traditional green tea with grassy notes \n"
				+ "Such as: Japan Sencha\nJapan Bancha\nJeju Sejak Korean Green\n"
				+ "You might also be interested in a greener, lightly oxidized Oolong \n"
				+ "Such as: Ma Liu Mi\nTi Quan Yin"));
		gridPane17.add(openFile7, 0, 1);
		vegMedCaf = new Scene(gridPane17);
		
		//Medium Caffeine Floral Flavored Scene
		GridPane gridPane18 = null;
		gridPane18 = new GridPane();
		gridPane18.setAlignment(Pos.CENTER);
		gridPane18.setPrefSize(500, 300);
		gridPane18.setVgap(10);
		Label teaRec11 = new Label(click);
		gridPane18.add(teaRec11, 0,0);
		Button openFile8 = new Button("Generate");
		openFile8.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a floral green tea \nSuch as: Jasmine Green Tea "
				+ "\nCherry Blossom Green Tea"));
		gridPane18.add(openFile8, 0, 1);
		floralMedCafFlavored = new Scene(gridPane18);
		
		//Fruity Medium Caffeine Flavored Scene
		GridPane gridPane19 = null;
		gridPane19 = new GridPane();
		gridPane19.setAlignment(Pos.CENTER);
		gridPane19.setPrefSize(500, 300);
		gridPane19.setVgap(10);
		Label teaRec12 = new Label(click);
		gridPane19.add(teaRec12, 0,0);
		Button openFile9 = new Button("Generate");
		openFile9.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a fruity green tea \nSuch as: Cranberry Mango Green Tea"
				+ "\nPineapple Coconut Green Tea\nPeach Green Tea\n"
				+ "Grapefruit Green Tea\nLemon Ginger Green Tea\n"
				+ "You might also be interested in a fruity Oolong\n"
				+ "Such as: Coconut Oolong\nGrapefruit Oolong\nPeach Oolong"));
		gridPane19.add(openFile9, 0, 1);
		fruityMedCaf = new Scene(gridPane19);
		
		//Low Caffeine Traditional Scene
		GridPane gridPane20 = null;
		gridPane20 = new GridPane();
		gridPane20.setAlignment(Pos.CENTER);
		gridPane20.setPrefSize(500, 300);
		gridPane20.setVgap(10);
		Label teaRec13 = new Label(click);
		gridPane20.add(teaRec13, 0,0);
		Button openFile10 = new Button("Generate");
		openFile10.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a traditional white tea\nSuch as: Silver Needle\n" + 
				"White Peony"));
		gridPane20.add(openFile10, 0, 1);
		lowCafTrad = new Scene(gridPane20);
		
		//Low Caffeine Flavored Scene
		GridPane gridPane21 = null;
		gridPane21 = new GridPane();
		gridPane21.setAlignment(Pos.CENTER);
		gridPane21.setPrefSize(500, 300);
		gridPane21.setVgap(10);
		Label teaRec14 = new Label(click);
		gridPane21.add(teaRec14, 0,0);
		Button openFile11 = new Button("Generate");
		openFile11.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a flavored white tea\nSuch as: Jasmine White\n"
				+ "Peach White\nVanilla White"));
		gridPane21.add(openFile11, 0, 1);
		lowCafFlav = new Scene(gridPane21);
		
		//Herbal Scene
		GridPane gridPane22 = null;
		gridPane22 = new GridPane();
		gridPane22.setAlignment(Pos.CENTER);
		gridPane22.setPrefSize(500, 300);
		gridPane22.setVgap(10);
		Label teaRec15 = new Label(click);
		gridPane22.add(teaRec15, 0,0);
		Button openFile12 = new Button("Generate");
		openFile12.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "an herbal tea \nSuch as: Mint\nChamomile\nGinger\nLinden Blossoms"));
		gridPane22.add(openFile12, 0, 1);
		herbal = new Scene(gridPane22);
		
		//Rooibos Scene
		GridPane gridPane23 = null;
		gridPane23 = new GridPane();
		gridPane23.setAlignment(Pos.CENTER);
		gridPane23.setPrefSize(500, 300);
		gridPane23.setVgap(10);
		Label teaRec16 = new Label(click);
		gridPane23.add(teaRec16, 0,0);
		Button openFile13 = new Button("Generate");
		openFile13.setOnAction(e -> writeTeaRec("Based on your preferences you should have "
				+ "a flavored Rooibos \nSuch as: Caramel Rooibos\n"
				+ "Vanilla Rooibos\nPeach Rooibos"));
		gridPane23.add(openFile13, 0, 1);
		rooibos = new Scene(gridPane23);
		
		primaryStage.setScene(caffeineScene);
		primaryStage.show();
		
	}
	/* Method that takes the text you want to be written as a parameter and writes it into the 
	file Your Tea Recommendation.txt using BufferedWriter */
	public void writeTeaRec(String text) {      
	    try (BufferedWriter bw = new BufferedWriter(new PrintWriter("src/Your Tea Recommendation.txt"))) {
	        bw.write(text);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		launch(args);	
		
/* need to use JavaFX a stage is the window, a scene is what you want, where each scene shows a 
 different set of prompts*/
	}

}

