object List {
	class Node(new_data: Integer, new_next_node: Option[Node] = None) {
		var data = new_data
		var next_node = new_next_node.get

		def get_data(): Integer = data
		def get_next(): Node = next_node
		def set_next(new_next_node: Node): Unit = {
			next_node = new_next_node
		}
	}

	class SinglyLinkedList(new_head: Option[Node] = None) {
		var head = new_head.get

		def insert(new_data: Integer): Unit = {
			var new_node: Node = new Node(new_data)
			new_node.set_next(head)
			head = new_node
		}

		def print(): Unit = {
			var current: Node = head
			while(Option(current) != Some(None)){
				println(current)
				current = current.get_next()
			}
		}
	}

	def main(arg: Array[String]): Unit = {
		var sll: SinglyLinkedList = new SinglyLinkedList()
		sll.insert(1)
		sll.insert(2)
		sll.insert(3)
		sll.insert(4)
		sll.insert(5)
		sll.print()
	}
}