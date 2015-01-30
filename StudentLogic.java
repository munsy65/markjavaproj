import java.util.Random;

import comp102x.ColorImage;
import comp102x.assignment.GameLogic;
import comp102x.assignment.GameRecord;
import comp102x.assignment.Goal;

public class StudentLogic implements GameLogic{
    
    
    public ColorImage generateIntermediateFootballImage(ColorImage[] depthImages, int initialStep, int currentStep, int finalStep, double initialScale, double finalScale, int initialX, int finalX, int initialY, int finalY) {
        // write your code after this line
        double stepMult = ((double)(currentStep-initialStep))/((double)(finalStep-initialStep));
        int imageIndex = (int) ((depthImages.length - 1) * stepMult);
  
        int xPosition = (int) (initialX + (finalX - initialX) * stepMult);          
        int yPosition =  (int) (initialY + (finalY - initialY) * stepMult);
        double scale = (initialScale + (finalScale - initialScale) * stepMult);
       depthImages[imageIndex].setX(xPosition);
       depthImages[imageIndex].setY(yPosition);
       depthImages[imageIndex].setScale(scale);

        return depthImages[imageIndex];
        
        
        
        

    }


    public void updateGoalPositions(Goal[][] goals) {
        // write your code after this line
        int numOfRows = goals.length;
        int numOfCols = goals[0].length;
        int moveGCol = 0;
        int moveGRow = 0;
        Random randomNumGen = new Random();
        for(int i=0; i<100; i++){
            int randGoalRow = randomNumGen.nextInt(numOfRows);
            int randGoalCol = randomNumGen.nextInt(numOfCols);
            Goal swapGoal = goals[randGoalRow][randGoalCol];
            Goal swapWith = goals[0][0];
            Goal origSwapGoal = goals[0][0];
            if (swapGoal.isHit() == true){
                continue;
            }
            if((randGoalRow  == 0) && (randGoalCol  == 0)){
                 swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true) {
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                } 
                 swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                       if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol];   
                  if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 0) && (randGoalCol  == 1)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                       origSwapGoal = swapGoal;
                       swapWith = swapGoal;
                       swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                      origSwapGoal = swapGoal;
                      swapWith = swapGoal;
                      swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                      origSwapGoal = swapGoal;
                      swapWith = swapGoal;
                      swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }    
            if((randGoalRow  == 0) && (randGoalCol  == 2)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
                if((randGoalRow  == 0) && (randGoalCol  == 3)){
                 swapWith = goals[randGoalRow][randGoalCol - 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                 swapWith = goals[randGoalRow + 1][randGoalCol -1 ];
                       if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                  swapWith = goals[randGoalRow + 1][randGoalCol];  
                  if(swapWith.isHit() == true){
                    swapGoal = swapWith;
                    swapWith = origSwapGoal;
                    continue;
                }
            }
                if((randGoalRow  == 1) && (randGoalCol  == 0)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow -1][randGoalCol  ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol + 1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 1) && (randGoalCol  == 1)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol + 1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol - 1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
                if((randGoalRow  == 1) && (randGoalCol  == 2)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol + 1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol - 1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 1) && (randGoalCol  == 3)){
                 swapWith = goals[randGoalRow + 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow + 1][randGoalCol - 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol - 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow -1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 2) && (randGoalCol  == 0)){
                 swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                } 
                 swapWith = goals[randGoalRow - 1][randGoalCol + 1];
                       if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol];   
                  if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 2) && (randGoalCol  == 1)){
                 swapWith = goals[randGoalRow - 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if((swapWith.isHit() == true) && (swapGoal.isHit() == false)){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 2) && (randGoalCol  == 2)){
                 swapWith = goals[randGoalRow - 1][randGoalCol];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol + 1];
                     if(swapWith.isHit() == true){
                         swapGoal = swapWith;
                         swapWith = origSwapGoal;
                         continue;
                }
                swapWith = goals[randGoalRow][randGoalCol + 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol -1 ];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
            if((randGoalRow  == 2) && (randGoalCol  == 3)){
                 swapWith = goals[randGoalRow][randGoalCol - 1];
                    if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                } 
                 swapWith = goals[randGoalRow - 1][randGoalCol - 1];
                       if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
                swapWith = goals[randGoalRow - 1][randGoalCol];   
                  if(swapWith.isHit() == true){
                    origSwapGoal = swapGoal;
                    swapWith = swapGoal;
                    swapWith = origSwapGoal;
                        continue;
                }
            }
        }
        
        
    }
    
    
   
    public GameRecord[] updateHighScoreRecords(GameRecord[] highScoreRecords, String name, int level, int score) {
        // write your code after this line
        
        
        return  new GameRecord[1];
        
        
    }
    
    
}
