#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;
int solve(){
    ll ppp,qqq,rrr,aaa,bbb,ccc;
    cin>>ppp>>qqq>>rrr;
    cin>>aaa>>bbb>>ccc;

    //check if answer is 0
    if (aaa==ppp&&bbb==qqq&&ccc==rrr){
        return 0;
    }

    //check if answer is 1
    if (aaa==0&&bbb==0&&ccc==0){
        return 1;
    }
    if ((aaa==ppp&&bbb==qqq)||(bbb==qqq&&ccc==rrr)||(ccc==rrr&&aaa==ppp)){
        return 1;
    }
    //through addition
    set<int>s;
    s.insert(aaa-ppp);
    s.insert(bbb-qqq);
    s.insert(ccc-rrr);
    if (s.size()==1){
        return 1;
    }
    if (s.size()==2&&(s.find(0))!=s.end()){
        return 1;
    }

    //through multiplication
    if (rrr==ccc&&qqq==bbb&&(ppp!=0)&&aaa%ppp==0){
        return 1;
    }
    if (ppp==aaa&&rrr==ccc&&(qqq!=0)&&bbb%qqq==0){
        return 1;
    }
    if (ppp==aaa&&qqq==bbb&&(rrr!=0)&&ccc%rrr==0){
        return 1;
    }
    if (rrr==ccc&&(qqq!=0)&&(ppp!=0)&&(aaa%ppp==0)&&(bbb%qqq==0)&&aaa/ppp==bbb/qqq){
        return 1;
    }
    if (qqq==bbb&&(rrr!=0)&&(ppp!=0)&&(aaa%ppp==0)&&(ccc%rrr==0)&&aaa/ppp==ccc/rrr){
        return 1;
    }
    if (ppp==aaa&&(qqq!=0)&&(rrr!=0)&&(ccc%rrr==0)&&(bbb%qqq==0)&&ccc/rrr==bbb/qqq){
        return 1;
    }
    if (ppp!=0&&qqq!=0&&rrr!=0&&(aaa%ppp==0)&&(bbb%qqq==0)&&(ccc%rrr==0)&&aaa/ppp==bbb/qqq&&bbb/qqq==ccc/rrr){
        return 1;
    }


    // check if ans is 2
    ll p=ppp,q=qqq,r=rrr,a=aaa,b=bbb,c=ccc,x,y;
    if (p==a||q==b||r==c){
        return 2;
    }
    if ((a-p==b-q)||(b-q==c-r)||(a-p==c-r)){
        return 2;
    }

    if ((p!=0&&q!=0)&&(a%p==0&&b%q==0&&a/p==b/q)||(q!=0&&r!=0)&&(b%q==0&&c%r==0&&b/q==c/r)||(p!=0&&r!=0)&&(a%p==0&&c%r==0&&a/p==c/r)){
        return 2;
    }

    if (p+b-q+c-r==a){
        return 2;
    }
//    if (a==b&&b==c){
//        return 2;
//    }

    if(p!=q &&(a-b)%(p-q)==0)
   {
       x=(a-b)/(p-q);
       y=b-q*x;
       assert(b-q*x==a-p*x);
       if(r*x==c || r*x+y==c || r+y==c)
       {//cout<<"f7";
       return 2;}
   }
    if(q!=0&&b%q==0)
   {
       x=b/q;
       y=a-p*x;
       if(r*x==c||r+y==c||r*x+y==c)
       {return 2;}
   }
   if(r!=0&&c%r==0)
   {
       x=c/r;
       y=a-p*x;
       if(q*x==b||q+y==b||q*x+y==b)
       {return 2;}
   }
   if(r!=q &&(c-b)%(r-q)==0)
   {
       x=(c-b)/(r-q);
       y=b-q*x;
       assert(b-q*x==c-r*x);
       if(p*x==a || p*x+y==a || p+y==a)
       {//cout<<"f15";
       return 2;}
   }
   if(r!=0&&c%r==0)
   {
       x=c/r;
       y=b-q*x;
       if(p*x==a||p+y==a||p*x+y==a)
       {return 2;}
   }
   if(p!=0&&a%p==0)
   {
       x=a/p;
       y=b-q*x;
       if(r*x==c||r+y==c||r*x+y==c)
       {return 2;}
   }
   if(p!=r &&(a-c)%(p-r)==0)
   {
       x=(a-c)/(p-r);
       y=a-p*x;
       assert(c-r*x==a-p*x);
       if(q*x==b || q*x+y==b || q+y==b)
       {//cout<<"f8";
       return 2;}
   }
   if(p!=0&&a%p==0)
   {
       x=a/p;
       y=c-r*x;
       if(q*x==b||q+y==b||q*x+y==b)
       {return 2;}
   }
   if(q!=0&&b%q==0)
   {
       x=b/q;
       y=c-r*x;
       if(p*x==a||p+y==a||p*x+y==a)
       {return 2;}
   }
   //(p+x)y=a
   if(a!=b &&(p*b-a*q)%(a-b)==0)
   {
       x=(p*b-a*q)/(a-b);
       if(q+x!=0)
       {y=b/(q+x);
       if(r+x==c || r*y==c ||(r+x)*y==c)
       {//cout<<"f9";
       return 2;}
       }
   }
   x=(b-q);
   if(p+x!=0 &&a%(p+x)==0)
   {
       y=a/(p+x);
       if((r+x==c || r*y==c ||(r+x)*y==c)&&(q+x==b||q*y==b||(q+x)*y==b))
       {//cout<<"f9";
       return 2;}
   }
   x=c-r;
   if(p+x!=0 &&a%(p+x)==0)
   {
       y=a/(p+x);
       if((r+x==c || r*y==c ||(r+x)*y==c)&&(q+x==b||q*y==b||(q+x)*y==b))
       {//cout<<"f9";
       return 2;}
   }
    if(c!=b &&(r*b-c*q)%(c-b)==0)
   {
       x=(r*b-c*q)/(c-b);
       if(q+x!=0)
       {y=b/(q+x);
       if(p+x==a || p*y==a ||(p+x)*y==a)
       {//cout<<"f10";
       return 2;}
       }
   }
   x=(b-q);
   if(r+x!=0 &&c%(r+x)==0)
   {
       y=c/(r+x);
       if((p+x==a || p*y==a ||(p+x)*y==a)&&(q+x==b||q*y==b||(q+x)*y==b))
       {//cout<<"f9";
       return 2;}
   }
   x=a-p;
   if(p+x!=0 &&a%(p+x)==0)
   {
       y=a/(p+x);
       if((p+x==a || p*y==a ||(p+x)*y==a)&&(q+x==b||q*y==b||(q+x)*y==b))
       {//cout<<"f9";
       return 2;}
   }
   if(a!=c &&(p*c-a*r)%(a-c)==0)
   {
       x=(p*c-a*r)/(a-c);
       if(p+x!=0)
       {y=a/(p+x);
       if(q+x==b || q*y==b ||(q+x)*y==b)
       {//cout<<"f11";
        return 2;}
       }
   }
   x=(c-r);
   if(q+x!=0 &&b%(q+x)==0)
   {
       y=b/(q+x);
       if((p+x==a || p*y==a ||(p+x)*y==a)&&(r+x==c||r*y==c||(r+x)*y==c))
       {//cout<<"f9";
       return 2;}
   }
   x=a-p;
   if(q+x!=0 &&a%(q+x)==0)
   {
       y=b/(q+x);
       if((p+x==a || p*y==a ||(p+x)*y==a)&&(r+x==c||r*y==c||(r+x)*y==c))
       {//cout<<"f9";
       return 2;}
   }
   //a=p*x*y 
   if(q!=0 && b%q==0)
   {
       y=b/q;
       if(p!=0 && y!=0)
      { x=a/(p*y);
       if(r*x==c || r*y==c ||r*x*y==c)
       {//cout<<"f12";
       return 2;}
      }
   }
   if(r!=0 && c%r==0)
   {
       y=c/r;
       if(q!=0 && y!=0)
       {x=b/(q*y);
       if(p*x==a || p*y==a ||p*x*y==a)
       {//cout<<"f13";
       return 2;}
       }
   }
   if(p!=0 && a%p==0)
   {
       y=a/p;
       if(r!=0 && y!=0)
       {x=c/(r*y);
       if(q*x==b || q*y==b ||q*x*y==b)
       {//cout<<"f14";
       return 2;}
       }
   }
  //p+x=a
  x=a-p;
  y=b-q-x;
  if(r+x+y==c || (r+x)*y==c||r+y==c||r*y==c)
  {return 2;}
  if(q+x!=0 && b%(q+x)==0)
  {y=b/(q+x);
      if(r+x+y==c || (r+x)*y==c||r+y==c||r*y==c)
      {return 2;}
  }
  y=b-q;
  if(r+x+y==c || (r+x)*y==c||r+y==c||r*y==c)
  {return 2;}
    if(q!=0 && b%q==0)
    {
        y=b/q;
        if(r+x+y==c || (r+x)*y==c||r+y==c||r*y==c)
        {return 2;}
    }
    //px=a
    if(p!=0 && a%p==0)
    {
        x=a/p;
        y=b-q*x;
        if(r*x+y==c||r*x*y==c||r+y==c||r*y==c)
        {return 2;}
        if(q*x!=0 && b%(q*x)==0)
        {
            y=b/(q*x);
            if(r*x+y==c||r*x*y==c||r+y==c||r*y==c)
            {return 2;}
        }
        y=b-q;
        if(r*x+y==c||r*x*y==c||r+y==c||r*y==c)
        {return 2;}
        if(q!=0)
        {
            y=b/q;
            if(r*x+y==c||r*x*y==c||r+y==c||r*y==c)
            {return 2;}
        }
    }
    //p+y==a
    y=a-p;
    x=b-q-y;
    if(r+x+y==c||r+x==c||r*x+y==c||r*x==c)
    {return 2;}
    x=b-q;
    if(r+x+y==c||r+x==c||r*x+y==c||r*x==c)
    {return 2;}
    if(q!=0&&(b-y)%q==0)
    {
      x=(b-y)/q;
      if(r+x+y==c||r+x==c||r*x+y==c||r*x==c)
      {return 2;}
    }
    if(q!=0&&(b)%q==0)
    {
      x=(b)/q;
      if(r+x+y==c||r+x==c||r*x+y==c||r*x==c)
      {return 2;}
    }
    //py=a
    if(p!=0&&a%p==0)
    {
        y=a/p;
        if(y!=0&&b%y==0)
        {x=(b/y)-q;
            if((r+x)*y==c||r+x==c||r*x+y==c||r*x==c)
            {return 2;}
        }
        x=b-q;
        if((r+x)*y==c||r+x==c||r*x+y==c||r*x==c)
            {return 2;}
        if(q*y!=0&&b%(q*y)==0)
        {
            x=b/(q*y);
            if((r+x)*y==c||r+x==c||r*x+y==c||r*x==c)
            {return 2;}
        }
        if(q!=0&&b%(q)==0)
        {
            x=b/(q);
            if((r+x)*y==c||r+x==c||r*x+y==c||r*x==c)
            {return 2;}
        }
    }
  return 3;
}

int main(){
    int t;
    cin>>t;
    while(t--){
        cout<<solve()<<endl;
    }
}