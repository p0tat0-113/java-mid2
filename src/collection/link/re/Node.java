package collection.link.re;

class Node {
    Object item;
    Node next;

    Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node node = this;
        while (node != null){
            sb.append(node.item);
            if (node.next != null){
                sb.append("->");
            }
            node = node.next;
        }

        sb.append("]");

        return sb.toString();
    }
}
