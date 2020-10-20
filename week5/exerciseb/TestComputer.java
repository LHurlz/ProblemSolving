package week5.exerciseb;

public class TestComputer {
    public static void main(String[] args) {
        String output="";

        Computer c1 = new Computer(new Case("Optiplex 7010","Dell",240,new Dimension(275,250,100)),"Acer 5363","Asus 2345");
        Computer c2 = new Computer(new Case("Optiplex GX620","Dell",230,new Dimension(315,300,120)),"LG 3421","Intel 6533");
        Computer c3 = new Computer(new Case("i-Blason","Apple",115,new Dimension(250,275,110)),"HP 5433","AMD 1942");

        Computer[] allComputers = {c1,c2,c3};

        output+="Displaying Computer objects\n\n";

        for(int i=0; i<allComputers.length; i++){
            output+="Computer " + (i+1) + "\n\n" + allComputers[i].toString()+"\n\n";
        }

        output+="Now displaying Computer objects with Optiplex case models\n\n";

        for(int j=0; j<allComputers.length; j++){
            if(allComputers[j].getCaseInfo().getModel().contains("Optiplex")){
                output+=allComputers[j].toString()+"\n\n";
            }
        }

        System.out.println(output);

    }
}
