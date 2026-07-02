#include <iostream>
using namespace std;
int main(){
    int id,qyt;
	string name; 
	double price,amount;
	cout<<"Enter Id:\t";
	cin>>id; 
	cout<<"Enter Name:\t";
	cin>>name;
	cout<<"Enter Qyt:\t";
	cin>>qyt;
	cout<<"Eenter price:\t";
	cin>>price;
	amount=qyt*price;
	cout<<"-----------------Report product------------\n";
	cout<<"Id         :"<<"id\n";
	cout<<"Name       :"<<"name\n";
	cout<<"Qyt        :"<<"qyt\n";
	cout<<"Price      :"<<"price\n";
	cout<<"Amount     :"<<"amount\n";
	cout<<"-------------------------------------------\n";
	cout<<"-------------------------------------------\n";
	cout<<"Id\tName\tQyt\tPrice\tAmount\n";
	cout<<"--------------------------------------------\n";
	cout<<id<<"\t"<<name<<"\t"<<qyt<<"\t"<<price<<"\t"<<amount<<"\n";
	return 0;
}