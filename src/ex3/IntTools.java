package ex3;

public class IntTools {
    private int nr;
    public IntTools(int nr){
        this.nr = nr;
    }
    public int digitSum(){
        int sum = 0;
        int tempNr = Math.abs(nr);

        while (tempNr > 0){
            sum += tempNr % 10;
            tempNr /= 10;
        } return sum;
    }
    public int lastDigit(){
        return  Math.abs(nr) % 10;
    }
    public int digitAt(int position) throws IllegalArgumentException{
        if (position < 0){
            throw new IllegalArgumentException("Invalid position!");
        }
        int tempNr = Math.abs(nr);
        for (int i =0; i < position; i++){
            tempNr /=10;
            if (tempNr == 0){
                throw new IllegalArgumentException("Invalid position!");
            }
        } return tempNr % 10;
    }

    public static void main(String[] args) {
        IntTools intTools = new IntTools(46457);
        System.out.println("Sum Digit: "+ intTools.digitSum());
        System.out.println("Last Digit: "+ intTools.lastDigit());
        try{
            System.out.println("Digit at position 3: "+ intTools.digitAt(3));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
