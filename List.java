package Question01;

    // Static nested List class
    public class List {
        private int maxSize;
        private int size;
        private Product[] ListEntry;
        private int position;

        public List(int size) {
            this.maxSize = size;
            this.ListEntry = new Product[maxSize];
            this.position = -1;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }
        public int ListSize() {
            return maxSize ;
        }

        public boolean isFull() {
            return size == maxSize;
        }

        public void InsertList(int p, Product element) {
            if (isFull()) {
                System.out.println("Attempt to insert into a full list");
                return;
            }

            if (p < 0 || p > position + 1) {
                System.out.println("Invalid position for insertion");
                return;
            }

            // Shift elements to make space
            for (int i = position; i >= p; i--) {
                ListEntry[i + 1] = ListEntry[i];
            }

            ListEntry[p] = element;
            position++;
            size++;
        }

        public void TraverseList() {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }

            System.out.println("Product ID\tName\t\tCategory\tPrice");
            System.out.println("-----------------------------------------------");
            for (int i = 0; i <= position; i++) {
                System.out.println(ListEntry[i].ProductID + "\t\t" +
                        ListEntry[i].Name + "\t\t" +
                        ListEntry[i].Category + "\t\t" +
                        ListEntry[i].Price);
            }
        }

        // Insertion Sort

        public void InsertionSort() {

            int i, j;

            Product temp;



            for(i = 1; i < ListSize(); i++) {

                if(ListEntry[i-1].Price > ListEntry[i].Price) {

                    temp = ListEntry[i];

                    ListEntry[i] = ListEntry[i-1];

                    ListEntry[i-1] = temp;

                }

            }

        }



        // Selection Sort

        public void SelectionSort() {
            int i, j, maxIndex;
            Product temp;
            for(i = 0; i < ListSize()-1; i++) {
                maxIndex = i;
                for(j = i+1; j < ListSize(); j++) {
                    if(ListEntry[j].Price > ListEntry[maxIndex].Price) {
                        maxIndex = j;

                    }

                }

                if(maxIndex != i) {

                    temp = ListEntry[i];

                    ListEntry[i] = ListEntry[maxIndex];

                    ListEntry[maxIndex] = temp;

                }

            }

        }



        // Binary Search - Iterative Version

        public int binarySearch(String  key) {

            int low = 0;

            int high = ListSize() - 1;



            while(low <= high) {

                int mid = (low + high) / 2;

                if(key == ListEntry[mid].ProductID) {

                    return mid;

                }

                if(key > ListEntry[mid].ProductID) {

                    low = mid + 1;

                }

                else {

                    high = mid - 1;

                }

            }

            return -1;

        }



        // Binary Search - Recursive Version

        public int binarySearchRec(char key) {

            return binarySearchRec(key, 0, ListSize() - 1);

        }



        private int binarySearchRec(char key, int low, int high) {

            if(low > high) {

                return -1;

            }



            int mid = (low + high) / 2;

            if(key == ListEntry[mid].Price) {

                return mid;

            }

            if(key > ListEntry[mid].Price) {

                return binarySearchRec(key, mid + 1, high);

            }

            else {

                return binarySearchRec(key, low, mid - 1);

            }

        }

    }



