/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecollections;

/**
 *
 * @author GaLa
 */
public class BinarySearchTree {
 
	public Node node;
	
	public BinarySearchTree(Game game) {
		this.node = new Node(game);
	}
 
	public Node insert(Node node,Game game) {
		if(node == null) {
			return new Node(game);
		}
                if(game == node.game){
                }
                else if(game.compareTo(node.game) == -1) {
			node.left = insert(node.left, game);
		}
		
		else  {
			node.right = insert(node.right, game);
		}
		return node;
	}
 
	public void inOrder(Node node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.game+"\n");
			inOrder(node.right);
		}
	}
	
	class Node{
	
		private Game game;
		private Node left;
		private Node right;
		public Node(Game game) {
			super();
			this.game = game;
			this.left = null;
			this.right = null;
		}
	}
}
