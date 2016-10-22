import java.util.Random;

public class Computer extends Player{
    
  
    public Computer(int player){
        super(player);
        System.out.println("Player 'Computer' created");
    }
    
    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, player);
    }
    
    @Override
    public void Try(Board board){
    	Random random=new Random();
        do{
            do{
                System.out.print("Line: ");
                attempt[0] = random.nextInt(4);
                
                if( attempt[0] > 3 ||attempt[0] < 1)
                    System.out.print("Invalid line. It's 1, 2 or 3");
                else
                	System.out.println(attempt[0]);
                
            }while( attempt[0] > 3 ||attempt[0] < 1);
            
            do{
                System.out.print("Column: ");
                attempt[1] = random.nextInt(3);
                
                if(attempt[1] > 3 ||attempt[1] < 1)
                    System.out.println("Invalid column. É 1, 2 or 3");
                else
                	System.out.print(attempt[1]);
                
            }while(attempt[1] > 3 ||attempt[1] < 1);
            
            attempt[0]--; 
            attempt[1]--;
            
            if(!checkTry(attempt, board))
                System.out.println("Placed already marked. Try other.");
        }while( !checkTry(attempt, board) );
    }
    
}