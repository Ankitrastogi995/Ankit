package Modelgraph;

import java.util.LinkedList;

import Modeltre.Tree;

public class Graph {

    private LinkedList<Tree> rootList;

    public Graph() {
        this.rootList = new LinkedList<Tree>();
    }

    public Graph(LinkedList<Tree> rootList) {
        this.rootList = rootList;
    }

    public LinkedList<Tree> getRootList() {
        return rootList;
    }


}