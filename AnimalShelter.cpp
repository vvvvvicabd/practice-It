/**
 * Problem: An animal shelter, which holds only dogs and cats, operates on a
 * strictly"first in, first out"basis. People must adopt either
 * the"oldest"(based on arrival time) of all animals at the shelter, or they can
 * select whether they would prefer a dog or a cat (and will receive the oldest
 * animal of that type). They cannot select which specific animal they would
 * like. Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat. You may
 * use the built in Linked list data structure.
 *
 */

#include<iostream>

using namespace std;

struct animalNode{
    string name;
    int order;
    animalNode *next;
};

class linked_list{
    private:
        animalNode *head,*tail;
    public:
        linked_list()
        {
            head = NULL;
            tail = NULL;
        }
        
        void enqueue(string animalName, int order){
            animalNode *tmp = new animalNode;
            tmp->name = animalName;
            tmp->order = order;
            tmp->next = NULL;

            if(head==NULL){
                head = tmp;
                tail = tmp;
            }
            else{
                tail->next = tmp;
                tail = tail->next;
                // or tail = tmp;
                // this is to move the pointer once again
            }
        }
        bool isOlderThan(animalNode* a){
            return this->head->order < a->order;
        }
        animalNode* dequeueDog(linked_list dogs){
            return dogs.head;
        }
        animalNode* dequeueCat(linked_list cats){
            return cats.head;
        }
        animalNode dequeueAny(linked_list dogs,linked_list cats){  
            dogs.isOlderThan(cats.head)==true?dequeueDog(dogs):dequeueCat(cats);
        }
};

int main(){
    linked_list dogs;
    linked_list cats;

    return 0;
}
