package q7;
import CTCILibrary.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class q7 {

    public q7() {

        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"},
                };
        String[] buildOrder = buildOrderWrapper(projects, dependencies);
        if (buildOrder == null) {
            System.out.println("Circular Dependency.");
        } else {
            for (String s : buildOrder) {
                System.out.println(s);
            }
        }

    }

    public static String[] buildOrderWrapper(String[] projects, String[][] dependencies) {
        Stack<Project> buildOrder = findBuildOrder(projects, dependencies);
        if (buildOrder == null) return null;
        String[] buildOrderString = convertToStringList(buildOrder);
        return buildOrderString;
    }

    public static Stack<Project> findBuildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildGraph(projects, dependencies);
        return orderProjects(graph.getNodes());
    }

    public static Graph buildGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();

        for (String[] dependency : dependencies) {
            String first = dependency[0];
            String second = dependency[1];
            graph.addEdge(first, second);
        }

        return graph;
    }

    public static String[] convertToStringList(Stack<Project> projects) {
        String[] buildOrder = new String[projects.size()];
        for (int i = 0; i < buildOrder.length; i++) {
            buildOrder[i] = projects.pop().getName();
        }
        return buildOrder;
    }


    public static Stack<Project> orderProjects(ArrayList<Project> projects) {
        Stack<Project> stack = new Stack<Project>();
        for (Project project : projects) {
            if (project.getState() == Project.State.BLANK) {
                if (!doDFS(project, stack)) {
                    return null;
                }
            }
        }
        return stack;
    }



    public static boolean doDFS(Project project, Stack<Project> stack) {
        if (project.getState() == Project.State.PARTIAL) {
            return false; // Cycle
        }

        if(project.getState() == Project.State.BLANK){
            project.setState(Project.State.PARTIAL);
            ArrayList<Project> children = project.getChildren();
            for(Project child: children){
                if(!doDFS(child, stack)){
                    return false;
                }

            }
            project.setState(Project.State.COMPLETE);
            stack.push(project);
        }

        return true;
    }


}
