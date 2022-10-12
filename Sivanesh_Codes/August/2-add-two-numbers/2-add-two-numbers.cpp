/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int c1=0;
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *ans=nullptr;
        ListNode *cur;
        while(l1!=nullptr && l2!=nullptr)
        {
            int x1=l1->val;
            int x2=l2->val;
            int sum=x1+x2+c1;
            c1=0;
            if(sum>9)
            {
                sum-=10;
                c1=1;
            }
            if(ans==nullptr)
            {
                ans=new ListNode(sum);
                cur=ans;
            }
            else
            {
                ListNode *temp=new ListNode(sum);
                cur->next=temp;
                cur=cur->next;
            }
            l1=l1->next;
            l2=l2->next;
        }
        while(l1!=nullptr)
        {
            int sum=l1->val+c1;
            c1=0;
            if(sum>9)
            {
                sum-=10;
                c1=1;
            }
            ListNode *temp=new ListNode(sum);
            cur->next=temp;
            cur=cur->next;
            l1=l1->next;
        }
        while(l2!=nullptr)
        {
            int sum=l2->val+c1;
            c1=0;
            if(sum>9)
            {
                sum-=10;
                c1=1;
            }
            ListNode *temp=new ListNode(sum);
            cur->next=temp;
            cur=cur->next;
            l2=l2->next;
        }
        if(c1==1)
        {
            ListNode *temp=new ListNode(1);
            cur->next=temp;
        }
        return ans;
    }
};