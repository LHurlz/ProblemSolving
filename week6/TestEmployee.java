package week6;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Joe Bloggs",1324,new Address("Chungus","Chungus","Chungus","Chungus","V93 NY30"),new Insurance("Chungus Insurance",353545));
        Employee e2 = new Employee("Shaggy",2235626,new Address("Shaggy","Shaggy","Shaggy","Shaggy","V93 NY30"),new Insurance("Shaggy Insurance",73465));
        Employee e3 = new Employee("Paul",134,new Address("Paul","Paul","Paul","Paul","V93 NY30"),new Insurance("Paul Insurance",454364));
        Employee e4 = new Employee("Eggs",3251,new Address("Eggs","Eggs","Eggs","Eggs","V93 NY30"),new Insurance("Chungus Insurance",7777345));
        Employee e5 = new Employee("Steve",13525,new Address("Steve","Steve","Steve","Steve","V93 NY30"),new Insurance("Steve Insurance",23254365));

        Employee[] allEmployees = {e1,e2,e3,e4,e5};

        for(int i=0; i<allEmployees.length; i++){
            System.out.println("Employee " + (i+1) + "\n\n" + allEmployees[i].toString() + "\n\n");
        }


    }
}
