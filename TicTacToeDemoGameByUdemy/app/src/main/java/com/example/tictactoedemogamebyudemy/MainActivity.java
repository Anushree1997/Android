package com.example.tictactoedemogamebyudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 0 = cross   1 = circle


    int activePlayer = 0;

    boolean gameIsActive = true;

    int[] gameState ={2,2,2,2,2,2,2,2,2};

    int[][] winningPosition = {{0 , 1 , 2} , {3 , 4 , 5} , {6 , 7 , 8} , {0 , 3 , 6} , {1 , 4 , 7} , {2 , 5 , 8} , {0 , 4 , 8} , {2 , 4 , 6} };
    public void dropIn(View view) {
        ImageView counter=(ImageView) view;

//        System.out.println(counter.getTag().toString());

        int tappedCounter=Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 2 && gameIsActive) {

            gameState[tappedCounter] = activePlayer;

            counter.setTranslationY(-1000f);

            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.cross);
                activePlayer=1;
            } else {
                counter.setImageResource(R.drawable.circle);
                activePlayer=0;
            }

            counter.animate().translationYBy(1000f).rotation(1800).setDuration(1000);

            for (int[] winningPosition : winningPosition){

                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                            gameState[winningPosition[0]] != 2){
                    //System.out.println(gameState[winningPosition[0]]);

                    // Someone has won!!!!!

                    gameIsActive = false;

                    String winner = "Circle";

                    if (gameState[winningPosition[0]] == 0)
                    {
                        winner = "Cross";
                    }


                    TextView winnerMessage = (TextView) findViewById(R. id.winnerMessage);
                    winnerMessage.setText(winner + " Has Won!!!!!");
                    LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
                    playAgainLayout.setVisibility(View.VISIBLE);
                }else{
                    boolean gameIsOver = true;
                    for(int counterState : gameState){
                        if (counterState == 2) gameIsOver = false;
                    }
                    if (gameIsOver){

                        TextView winnerMessage = (TextView) findViewById(R. id.winnerMessage);
                        winnerMessage.setText("Its a Draw!!!!!");
                        LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
                        playAgainLayout.setVisibility(View.VISIBLE);

                    }
                }
            }
        }
    }
                    public  void playAgain(View view){

                        gameIsActive = true;

                        LinearLayout playAgainLayout = (LinearLayout) findViewById(R.id.playAgainLayout);
                        playAgainLayout.setVisibility(View.INVISIBLE);

                        activePlayer=0;


                        //gameState={2, 2, 2, 2, 2, 2, 2, 2, 2};
                        for (int i = 0; i < gameState.length; i++) {
                            gameState[i] = 2;
                        }
                        GridLayout gridLayout = (GridLayout) findViewById(R.id.grid);
                        for (int i = 0; i < gridLayout.getChildCount(); i++ ){
                            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
                        }
                    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
