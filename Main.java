public class Main {
    private static double calculate_delta(int [] arr){
        if(arr.length==0)
            return 0;
        return arr[1]*arr[1]-4*arr[0]*arr[2];
    }
    private static void show_x(int [] arr){
        double delta = calculate_delta(arr);
        if(delta < 0){
            System.out.println("Brak_pierwiastkow");
        }
        if(delta == 0){
            System.out.println("x="+(-arr[1]/2*arr[0]));
        }
        else{
            System.out.println("x1="+(-arr[1]-Math.sqrt(delta)/2*arr[0])+
                    " x2="+(-arr[1]+Math.sqrt(delta)/2*arr[0]));
        }
    }
    public static void main(String[] args) {
        try{
            if(args.length>3 || args.length==0)
            {
                throw new IllegalArgumentException("Wrong input");
            }
            int [] int_array = new int[args.length];
            for(int i=0; i < args.length; i++)
            {
                int_array[i] = Integer.parseInt(args[i]);
            }
            show_x(int_array);
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
