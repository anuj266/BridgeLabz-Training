package linkedlist;

class ItemNode{
	int itemId;
	String itemName;
	int quantity;
	double price;
	ItemNode next;
	
	ItemNode(int itemId ,String itemName , int quantity , double price ){
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}
public class InventoryManagementSystem {
	
	static ItemNode addAtStart(ItemNode Head , int itemId ,String itemName , int quantity , double price ) {
		ItemNode newNode = new ItemNode(itemId , itemName , quantity , price);
		if(Head == null) {
			return newNode;
		}
		newNode.next = Head;
		Head = newNode;
		return Head;
	}
	static ItemNode addAtLast(ItemNode Head , int itemId ,String itemName , int quantity , double price ) {
		ItemNode newNode = new ItemNode(itemId , itemName , quantity , price);
		if(Head == null) {
			return newNode;
		}
		ItemNode curr = Head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.next = null;
		return Head;
	}
	static ItemNode addAtSpecificPosition(ItemNode Head , int itemId ,String itemName , int quantity , double price , int pos) {
		ItemNode newNode = new ItemNode(itemId , itemName , quantity , price);
		if(pos == 1) {
			return addAtStart(Head , itemId , itemName , quantity , price);
		}
		ItemNode curr = Head;
		ItemNode prev = null;
		for(int i=1;i<pos;i++) {
			if(curr.next == null) {
				System.out.println("Position is invalid");
			}
			prev = curr ;
			curr = curr.next;
		}
		prev.next = newNode;
		newNode.next = curr;
		return Head;
	}
	static ItemNode delete(ItemNode Head , int itemId) {
		ItemNode curr = Head;
		if(curr.next == null && curr.itemId == itemId) {
			return null;
		}
		while(curr.next != null && curr.next.itemId != itemId) {
			curr = curr.next;
		}
		if(curr.next.itemId == itemId) {
			curr.next = curr.next.next;
		}
		if(curr.next == null) {
			System.out.println(itemId + "Not Found");
		}
		return Head;
		
	}
	static ItemNode update(ItemNode Head , int itemId , int quantity ) {
		ItemNode curr = Head;
		while(curr.next != null && curr.next.itemId != itemId) {
			curr = curr.next;
		}
		if(curr.next.itemId == itemId) {
			curr.next.quantity = quantity;
		}
		if(curr.next == null) {
			System.out.println(itemId + "Not found");
		}
		return Head;
	}
	static void search(ItemNode Head , int itemId ) {
		ItemNode curr = Head;
		while(curr != null) {
			if(curr.itemId == itemId) {
				System.out.println("Found");
				return;
			}
			curr = curr.next;
		}
		System.out.println("Not Found");
	}
	static void search(ItemNode Head, String itemName) {
	    ItemNode curr = Head;

	    while (curr != null) {
	        if (curr.itemName.equals(itemName)) {
	            System.out.println("Found");
	            return;
	        }
	        curr = curr.next;
	    }

	    System.out.println("Not Found");
	}
	static void calculateTotalValue(ItemNode Head) {
        double total = 0;
        ItemNode temp = Head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }
	static ItemNode sortByItemName(ItemNode Head) {
	    if (Head == null || Head.next == null) {
	        return Head;
	    }

	    boolean swapped;

	    do {
	        swapped = false;
	        ItemNode curr = Head;

	        while (curr.next != null) {
	        	
	            if (curr.itemName.compareToIgnoreCase(curr.next.itemName) > 0) {
	                int tempId = curr.itemId;
	                String tempName = curr.itemName;
	                int tempQty = curr.quantity;
	                double tempPrice = curr.price;

	                curr.itemId = curr.next.itemId;
	                curr.itemName = curr.next.itemName;
	                curr.quantity = curr.next.quantity;
	                curr.price = curr.next.price;

	                curr.next.itemId = tempId;
	                curr.next.itemName = tempName;
	                curr.next.quantity = tempQty;
	                curr.next.price = tempPrice;

	                swapped = true;
	            }
	            curr = curr.next;
	        }
	    } while (swapped);

	    return Head;
	}
	static void display(ItemNode Head) {
		ItemNode curr = Head;
		if(curr == null) {
			System.out.println("List is empty");
		}
		
		while(curr != null) {
			System.out.println(curr.itemId+" "+curr.itemName+" "+curr.quantity+" "+curr.price);
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		ItemNode Head = new ItemNode(3 , "Toothbrush" , 3 , 12.0);
		Head = addAtStart(Head , 1 , "Rusk" , 5 , 20.0);
		Head = addAtLast(Head , 4 , "Watches" , 5 , 60.0);
		Head = addAtSpecificPosition(Head , 2 , "Toys" , 6 , 30.0 , 2);
		Head = delete(Head , 3);
		Head = update(Head , 4 , 7 );
		search(Head , 4);
		calculateTotalValue(Head);
		Head = sortByItemName(Head);

		display(Head);
	}

}
