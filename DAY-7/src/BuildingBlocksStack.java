import java.util.Stack;

public class BuildingBlocksStack {
    public static void main(String[] args) {
        Stack<String> BuildingBlocks = new Stack<String>();
        BuildingBlocks.push("Green Block");
        BuildingBlocks.push("Red Block");
        BuildingBlocks.push("Yellow Block");
        BuildingBlocks.push("Blue Block");
        System.out.println(BuildingBlocks);

        for (String x : BuildingBlocks) {
            System.out.println(x);
        }

        BuildingBlocks.pop();
        System.out.println(BuildingBlocks);

        System.out.println(BuildingBlocks.peek());
        System.out.println(BuildingBlocks.clone());
    }
}


