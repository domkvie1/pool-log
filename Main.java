import java.util.*;

class Reading{
    static final double MIN_PH = 7.2;
    static final double MAX_PH = 7.8;
    static final double MIN_CL = 1.0;
    static final double MAX_CL = 3.0;
    
    String date;
    double ph;
    double chlorine;
    
    Reading(String date, double ph, double chlorine){
        this.date = date;
        this.ph = ph;
        this.chlorine = chlorine;
    }
    boolean isOutOfRange(){
         return ph < MIN_PH || ph > MAX_PH || chlorine < MIN_CL || chlorine > MAX_CL;
    }
    public String toString(){
        return "Date of reading: " + date + " | pH: " + ph + " | Chlorine: " + chlorine;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Reading> log = new ArrayList<>();
        while(true){
            System.out.println("What is the date for your reading? (or type done):");
            String date = sc.next();
            if(date.equals("done")) break;
            System.out.println("pH level? (Enter as decimal: 1.0 or 2.2)");
            double ph = sc.nextDouble();
            System.out.println("Chlorine level? (Enter as decimal: 1.0 or 2.2)");
            double chlorine = sc.nextDouble();
            Reading r = new Reading(date, ph, chlorine);
            System.out.println(r);
            if(r.isOutOfRange()) System.out.println("Bad levels. Act accordingly");
            else System.out.println("Levels are good, continue operations.");
            log.add(r);
            
        }
        System.out.println("Total readings: " + log.size());
        for(Reading r : log){
            if(r.isOutOfRange()) System.out.println("Bad reading: " + r);
        }
    }
}
