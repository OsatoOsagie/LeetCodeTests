class LinkedLists {

    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if (slow == fast) {
                return true
            }
        }

        return false
    }

    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }

    fun deleteDuplicates(node: ListNode?): ListNode? {

        var head=node
        val set= mutableSetOf<ListNode>()

        while (head !=null){

            if (head.value== head.next?.value ){

                head= head.next?.next
            }else {
                head = head.next
            }

        }
        println(node.toString())
        return node

    }

    fun reverseBetween(head: ListNode?, left:Int, right:Int): ListNode?{

        val dummy = ListNode(0,head)

        var before =dummy

        for(i in 1 until left){
            before= before.next!!
        }

        var prev = before;
        var curr = before.next

        for (i in left..right){
            var next = curr?.next
            curr?.next=prev
            prev=curr!!
            curr=next
        }


//        TODO("confused about this!!!")
        before.next?.next= curr
        before.next = prev

        return dummy.next
    }

}