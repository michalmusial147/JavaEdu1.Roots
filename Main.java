public class Main {
    private static double calculate_delta(double [] arr){
        return (arr[1]*arr[1]) - (4*arr[0]*arr[2]);
    }
    private static void show_roots(double [] arr){
        double delta = calculate_delta(arr);
        if(arr[0]==0)
        {
            if(arr[2] == 0)
            {  System.out.println("x=0");}
            else{
                System.out.println("x="+ -arr[1]/arr[2]);
            }

        }
        else if(delta < 0){ System.out.println("Brak_pierwiastkow");
        }
        else if(delta == 0){
            System.out.println("x="+(-arr[1]/2*arr[0]));
        }
        else{
            System.out.println("x1="+( (-arr[1] - Math.sqrt(delta) ) / (2*arr[0])  )
                    + " x2="+( (-arr[1] + Math.sqrt(delta) ) / (2*arr[0])) );
        }
    }
    public static void main(String[] args) {
        try{
            if(args.length>3 || args.length==0)
            {
                throw new IllegalArgumentException("Wrong input. Three arguments please.");
            }
            double [] doubles_array = new  double[args.length];
            for(int i=0; i < args.length; i++)
            {
                doubles_array[i] = Double.parseDouble(args[i]);
            }
            show_roots(doubles_array);
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
