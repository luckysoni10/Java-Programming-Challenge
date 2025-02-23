//Question 5
//Tower of Hanoi
public class Question5 {
    public static void main(String[] args) {
        int n = 3;
        towerOFHanoi(n, "A", "B", "c");
    }
    public static void towerOFHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOFHanoi(n-1, src, dest, helper);

        //transfer nth from src to dest
        System.out.println("transfer disk "+n+" from "+src+" to "+helper);

        //transfer n-1 fr4om helper to dest using src as 'helper'
        towerOFHanoi(n-1, helper, src, dest);
    }
}
//Output-
// transfer disk 1 from A to B
// transfer disk 2 from A to B
// transfer disk 1 from B to c
// transfer disk 3 from A to c
// transfer disk 1 from c to A
// transfer disk 2 from c to A
// transfer disk 1 from A to B
// transfer disk 4 from A to B
// transfer disk 1 from B to c
// transfer disk 2 from B to c
// transfer disk 1 from c to A
// transfer disk 3 from B to A
// transfer disk 1 from A to B
// transfer disk 2 from A to B
// transfer disk 1 from B to c