package Fishing;

import java.util.Random;

import graphics.Select;
import graphics.Ui;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class Fishing  {
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

        fishButton = new Button("Pescuiește!");
        fishButton.setOnAction(e -> fishAction());

        upgradeSpeedButton = new Button("Upgrade viteză (" + upgradeSpeedCost + " puncte)");
        upgradeSpeedButton.setOnAction(e -> upgradeSpeedAction());

        upgradeRarityButton = new Button("Upgrade șanse pești (" + upgradeRarityCost + " puncte)");
        upgradeRarityButton.setOnAction(e -> upgradeRarityAction());

        resultLabel = new Label("Prinde un pește!");
        scoreLabel = new Label("Scor: 0");
        upgradeLabel = new Label("Putere click: " + clickPower);

        progressBar = new ProgressBar(0);

        timer = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            if (progressBar.getProgress() > 0) {
                progressBar.setProgress(Math.max(progressBar.getProgress() - regressionRate / 100.0, 0));
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();

        HBox upgradeButtons = new HBox(10, upgradeSpeedButton, upgradeRarityButton);
        upgradeButtons.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10, fishButton, upgradeButtons, resultLabel, scoreLabel, upgradeLabel, progressBar);
        layout.setAlignment(Pos.CENTER);
    }

    private static void fishAction() {
        double currentValue = progressBar.getProgress();
        progressBar.setProgress(Math.min(currentValue + clickPower / 100.0, 1.0));

        if (progressBar.getProgress() == 1.0) {
            String caughtFish = catchFish();
            resultLabel.setText("Ai prins un " + caughtFish + "!");
            scoreLabel.setText("Scor: " + score);
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
            upgradeSpeedButton.setText("Upgrade viteză (" + upgradeSpeedCost + " puncte)");
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