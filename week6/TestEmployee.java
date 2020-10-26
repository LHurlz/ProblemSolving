package week6;

public class TestEmployee {
    public static void main(String[] args) {
        Insurance e1Insurance = new Insurance("Irish Life Excel",5468292);
        Employee e1 = new Employee("Joseph Bloggs III",536272,new Address("123 Hyde Road","Ballydehob","Cork","Ireland","R54HT7D"),e1Insurance);

        Insurance e2Insurance = new Insurance("AXA Superlative Life",9374633);
        Employee e2 = new Employee("Marie O Connell",982111,new Address("Boreen na dTonnta","Connemara","Galway","Ireland","PG52K3B"),e2Insurance);

        Insurance e3Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee e3 = new Employee("Mark McManus",352723,new Address("87 Racecourse Lawn","Tralee","Kerry","Ireland","AH78P36"),e3Insurance);

        Employee[] allEmployees = new Employee[5];
        allEmployees[0]=e1;
        allEmployees[1]=e2;
        allEmployees[2]=e3;

        System.out.println("Displaying the " + allEmployees.length + " Employee objects");

        for(int i=0; i< allEmployees.length; i++){
            System.out.println("\n\nEmployee " + (i+1) + "\n\n"+allEmployees[i]);
        }

        int subJoseph=-1;
        String listOfJoes="";

        System.out.println("\n\nSearching the array for Employees whose name contains 'joseph'");

        for(int i=0; i<allEmployees.length; i++){
            if(allEmployees[i]!=null && allEmployees[i].getName().toLowerCase().contains("joseph"))
              {
                  listOfJoes+="\n\n"+allEmployees[i];
                  subJoseph=i;
              }
        }

        System.out.println(listOfJoes);

        System.out.println("\n\nNow changing the address of Joseph Bloggs III");

        allEmployees[subJoseph].setAddress(new Address("56 Main Street","Thurles","Tipperary","Ireland","B87JH5Q"));

        System.out.println("\n\nDisplaying the new state of Joseph Bloggs III\n\n"+allEmployees[subJoseph]);

        System.out.println("\n\nNow removing the insurance details for the second employee object");
        e2.setInsurance(null);

        System.out.println("\n\nNew state of the second employee object\n\n"+e2.toString());

        System.out.println("\n\nDisplaying the  state of second employee insurance object\n\n"+e2Insurance);

        System.out.println("\n\nDisplaying the state of all employees who hail from Kerry");

        String kerryList="";

        for(int i=0; i< allEmployees.length; i++){
            if(allEmployees[i]!=null && allEmployees[i].getAddress().getCounty().equalsIgnoreCase("kerry"))
                kerryList+="\n\n"+allEmployees[i];
        }

        System.out.println(kerryList);

        Insurance e4Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee e4 = new Employee("Jaimie O Toole",234234,new Address("2 Rock St","Mallow","Cork","Ireland","YU67R34"),e4Insurance);

        Insurance e5Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee e5 = new Employee("Lara Connolly",568554,new Address("12 Westbrook Drive","Trim","Meath","Ireland","78TYMDS"),e5Insurance);

        allEmployees[3]=e4;
        allEmployees[4]=e5;

        sortEmployeesByName(allEmployees);

        System.out.println("\n\nDisplaying the state of the Employee objects after alphabetical sorting");

        for(int i=0; i< allEmployees.length; i++){
            System.out.println("\n\nEmployee "+(i+1)+"\n\n"+allEmployees[i]);
        }
    }

    private static void sortEmployeesByName(Employee[] allEmployees){
        String smallest;
        Employee temp;
        int sub;

        for(int i=0; i<allEmployees.length-1; i++){
            smallest=allEmployees[i].getName();
            sub=i;

            for(int j=i+1; j<allEmployees.length; j++){
                if(allEmployees[j].getName().compareTo(smallest)<0)
                  {
                      smallest=allEmployees[j].getName();
                      sub=j;
                  }
            }

            temp=allEmployees[i];
            allEmployees[i]=allEmployees[sub];
            allEmployees[sub]=temp;
        }

    }
}
