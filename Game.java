/*public class Game {
    private level levelOne;
    private level levelTwo;
    private level levelThree;

       public boolean isBonus() { 
        return false; 
    }

       public void play() { 
    }

    public int getScore()
{
    int score = 0;

    if(levelOne.goalReached())
    {
        score += levelOne.getPoints();

        if(levelTwo.goalReached())
        {
            score += levelTwo.getPoints();

            if(levelThree.goalReached())
            {
                score += levelThree.getPoints();
            }
        }
    }

    if(isBonus())
        score *= 3;

    return score;
}

public int playManyTimes(int num)
{
    play();
    int bestScore = getScore();

    for(int g = 2; g <= num; g++)
    {
        play();
        int score = getScore();
        if(score > bestScore)
            bestScore = score;
    }

    return bestScore;
}
}
*/