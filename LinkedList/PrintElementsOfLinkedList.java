class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node var = head;
        while(var!= null){
            System.out.print(var.data+" ");
            var = var.next;
        }
    }
}