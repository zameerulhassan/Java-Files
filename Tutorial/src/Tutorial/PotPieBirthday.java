package Tutorial;
public class PotPieBirthday {
   private String name;
   private PotPie birthdayObject;
   
   public PotPieBirthday(String theName, PotPie theDate){
       name = theName;
       birthdayObject = theDate;
   }
   public String toString(){
       return String.format("My name is %s, my birthday is %s", name,birthdayObject);
   }
}
