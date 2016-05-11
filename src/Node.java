
public class Node<T>
{
   private T data;
   private Node<T> next;
   
    Node(T data) {
       this.data = data;
       this.next = null;
   }
   
   /**
    * @return the data
    */
   public T getData()
   {
      return this.data;
   }
   /**
    * @param data the data to set
    */
   public void setData(T data)
   {
      this.data = data;
   }
   /**
    * @return the next
    */
   public Node<T> getNext()
   {
      return next;
   }
   /**
    * @param next the next to set
    */
   public void setNext(Node<T> next)
   {
      this.next = next;
   }
   
   public String toString()
   {
      String result = "";
      result += this.data;
      return result;
   }
   
}
