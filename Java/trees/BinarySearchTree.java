public class BinarySearchTree {
  private class Node {
    public int key;
    public Node left, right;

    public Node(int key) {
      this.key = key;
      left = null;
      right = null;
    }

    //Método para saber si un nodo es hoja
    public boolean isLeaf() {
      return left == null && right == null;
    }

    public String toString() {
      return "" + key;
    }
  }
  public Node root;

  public BinarySearchTree() {
    root = null;
  }

  //Métodos utilizados para recuperar un nodo del árbol mediante su clave
  public Node recover(int key) {
    return recover(root, key);
  }
  private Node recover(Node actualNode, int key) {
    if(actualNode == null) return null;
    if(key < actualNode.key) return recover(actualNode.left, key);
    if(key > actualNode.key) return recover(actualNode.right, key);
    return actualNode;
  }

  //Métodos utilizados para recuperar los nodo de clave mínima o máxima de un árbol
  private Node minRecover(Node actualNode) {
    if(actualNode.left != null) return minRecover(actualNode.left);
		return actualNode;
  }
  private Node maxRecover(Node actualNode) {
    if(actualNode.right != null) return maxRecover(actualNode.right);
		return actualNode;
  }

  //Métodos utilizados para saber si existe un nodo en el árbol mediante su clave
  public boolean exist(int key) {
    return exist(root, key);
  }
  private boolean exist(Node actualNode, int key) {
    if(actualNode == null) return false;
    if(key < actualNode.key) return exist(actualNode.left, key);
    if(key > actualNode.key) return exist(actualNode.right, key);
    return true;
  }

  //Métodos utilizados para insertar una nueva clave al árbol
  public void insert(int key) {
    root = insert(root, key);
  }
  private Node insert(Node actualNode, int key) {
    if(actualNode == null) actualNode = new Node(key);
    else if(key < actualNode.key) actualNode.left = insert(actualNode.left, key);
    else if(key > actualNode.key) actualNode.right = insert(actualNode.right, key);
    return actualNode;
  }

  //Métodos utilizados para eliminar un nodo del árbol mediante su clave
  public void remove(int key) {
    if(exist(key)) root = remove(root, key);
  }
  private Node remove(Node actualNode, int key) {
    Node result = actualNode;
    if(result == null) return null;
    if(key < actualNode.key) result.left = remove(actualNode.left, key);
    else if(key > actualNode.key) result.right = remove(actualNode.right, key);
    else {
      if(actualNode.isLeaf()) return null;
      else if(actualNode.left != null & actualNode.right != null) {
        Node maxLeft = maxRecover(actualNode.left);
        result.key = maxLeft.key;
        result.left = remove(actualNode.left, key);
        //Se puede usar lo siguiente en lugar de las 3 líneas anteriores
        /*
        Node minRight = minRecover(actualNode.right);
        result.key = minRight.key;
        result.right = remove(actualNode.right, key);
        */
      }
      else if(actualNode.left != null) result = actualNode.left;
      else result = actualNode.right;
    }

    return result;
  }

  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(50); 
    tree.insert(30); 
    tree.insert(20); 
    tree.insert(40); 
    tree.insert(70); 
    tree.insert(60); 
    tree.insert(80);

    System.out.println(tree.root);
    System.out.println(tree.root.right);
    System.out.println(tree.root.left);

    tree.remove(20);
    tree.remove(30);
    tree.remove(70);

    System.out.println(tree.root);
    System.out.println(tree.root.right);
    System.out.println(tree.root.left);
    System.out.println(tree.root.right.left);
  }
}
