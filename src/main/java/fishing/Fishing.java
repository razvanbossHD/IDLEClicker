package fishing;

import java.util.Random;

import graphics.Buttons;
import graphics.Select;
import graphics.Ui;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;
import time.Loop;

public class Fishing {
    private static Button fishButton;
    private static Button upgradeSpeedButton;
    private static Button upgradeRarityButton;
    private static Label resultLabel;
    private static Label scoreLabel;
    private static Label upgradeLabel;
    private static ProgressBar progressBar;
    public static int score = 0;
    private static int clickPower = 10;
    private static int upgradeSpeedCost = 50;
    private static int upgradeRarityCost = 100;
    private static int regressionRate = 10;
    private static int commonFishChance = 50;
    private static int rareFishChance = 35;
    private static int legendaryFishChance = 15;
    private static Timeline timer;

    public static void start() {
        Ui.pane.getChildren().clear();
        Select.selecter();
        Loop.minigame = 2;

        double centerX = Ui.pane.getWidth() / 2 - 100; 
        double centerY = Ui.pane.getHeight() / 2 - 25;

        

        
        fishButton = Buttons.add(() -> fishAction(), "Pescuiește!", 200, 50, centerX, centerY);

        upgradeSpeedButton = Buttons.add(() -> upgradeSpeedAction(), "Upgrade viteză (" + upgradeSpeedCost + " puncte)", 250, 50, 50, 120);
        upgradeSpeedButton.setFont(new Font("Arial", 12));  

        upgradeRarityButton = Buttons.add(() -> upgradeRarityAction(), "Upgrade șanse pești (" + upgradeRarityCost + " puncte)", 250, 50, 50, 190);
        upgradeRarityButton.setFont(new Font("Arial", 12)); 

        resultLabel = new Label("Prinde un pește!");
        resultLabel.setFont(new Font("Arial", 24)); 
        resultLabel.setTextFill(Color.WHITE); 
        resultLabel.setLayoutX(centerX - 50); 
        resultLabel.setLayoutY(centerY + 120);

        scoreLabel = new Label("Scor: 0");
        scoreLabel.setFont(new Font("Arial", 24)); 
        scoreLabel.setTextFill(Color.WHITE); 
        scoreLabel.setLayoutX(10); 
        scoreLabel.setLayoutY(10);

        upgradeLabel = new Label("Putere click: " + clickPower);
        upgradeLabel.setTextFill(Color.WHITE); 
        upgradeLabel.setLayoutX(50);
        upgradeLabel.setLayoutY(250);

        progressBar = new ProgressBar(0);
        progressBar.setPrefWidth(300);
        progressBar.setLayoutX(centerX - 50); 
        progressBar.setLayoutY(centerY + 70);

        Ui.pane.getChildren().addAll(resultLabel, scoreLabel, upgradeLabel, progressBar);

        timer = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            if (progressBar.getProgress() > 0) {
                progressBar.setProgress(Math.max(progressBar.getProgress() - regressionRate / 100.0, 0));
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();
    }

    private static void fishAction() {
        double currentValue = progressBar.getProgress();
        progressBar.setProgress(Math.min(currentValue + clickPower / 100.0, 1.0));

        if (progressBar.getProgress() == 1.0) {
            String caughtFish = catchFish();
            resultLabel.setText("Ai prins un " + caughtFish + "!");
            scoreLabel.setText("Scor: " + score);

    
            switch (caughtFish) {
                case "pește comun (10 puncte)":
                    resultLabel.setTextFill(Color.RED); 
                    break;
                case "pește rar (25 puncte)":
                    resultLabel.setTextFill(Color.BLUE); 
                    break;
                case "pește legendar (50 puncte)":
                    resultLabel.setTextFill(Color.GOLD); 
                    break;
            }

            progressBar.setProgress(0); 
        }
    }

    private static String catchFish() {
        Random rand = new Random();
        int chance = rand.nextInt(100);

        if (chance < commonFishChance) {
            score += 10;
            return "pește comun (10 puncte)";
        } else if (chance < commonFishChance + rareFishChance) {
            score += 25;
            return "pește rar (25 puncte)";
        } else {
            score += 50;
            return "pește legendar (50 puncte)";
        }
    }


    private static void upgradeSpeedAction() {
        if (score >= upgradeSpeedCost) {
            score -= upgradeSpeedCost;
            clickPower += 5;
            regressionRate = Math.max(regressionRate - 2, 1);
            upgradeSpeedCost += 50;
            upgradeSpeedButton.setText("Upgrade Viteză (" + upgradeSpeedCost + " puncte)");
            upgradeLabel.setText("Putere click: " + clickPower);
            scoreLabel.setText("Scor: " + score);
        } else {
            resultLabel.setText("Nu ai suficiente puncte pentru upgrade!");
        }
    }

    private static void upgradeRarityAction() {
        if (score >= upgradeRarityCost) {
            score -= upgradeRarityCost;
            if (commonFishChance > 30) {
                commonFishChance -= 5;
                rareFishChance += 3;
                legendaryFishChance += 2;
            }
            upgradeRarityCost += 100;
            upgradeRarityButton.setText("Upgrade șanse pești (" + upgradeRarityCost + " puncte)");
            scoreLabel.setText("Scor: " + score);
        } else {
            resultLabel.setText("Nu ai suficiente puncte pentru upgrade!");
        }
    }
}