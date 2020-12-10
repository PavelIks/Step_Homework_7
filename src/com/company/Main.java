/*Домашнее задание*/
// ----------------------------------> git log --pretty=format:"%h - %ar : %s"
// ----------------------------------> git rebase --interactive 5f38185^
// ----------------------------------> reword 5f38185 order status

// ----------------------------------> git log --oneline
// ----------------------------------> git show --stat 5f38185

/*Задание 1 Создайте шаблонный класс Array, который представляет собой массив, позволяющий хранить объекты заданного типа. Необходимо реализовать:
1) заполнение массива с клавиатуры;
2) заполнение массива случайными числами;
3) отображение массива;
4) поиск максимального значения;
5) поиск минимального значения;
6) подсчет среднеарифметического значения;
7) сортировка массива по возрастанию;
8) сортировка массива по убыванию;
- 9) поиск значения в массиве, используя бинарный поиск;
- 10) замена значения в массиве на новое значение.*/

package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortNumbsList implements Comparable <Array_Class>
{
    public Integer publicintegernumber;
    public void NumbersClass(Integer integernumber)
    {
        this.publicintegernumber = integernumber;
    }
    @Override
    public int compareTo(Array_Class array_class)
    {
        int result = this.publicintegernumber.compareTo(publicintegernumber);
        return result;
    }
    public int SortNumbsList_Display()
    {
        return publicintegernumber;
    }
}

class Array_Class
{
    int intNumber;
    Array_Class (int intnumber)
    {
        this.intNumber = intnumber;
    }
    public int getNumber()
    {
        return intNumber;
    }
    public int ArrayClass_Display()
    {
        return getNumber();
    }
}

class Main
{
    public static void main(String[] args)
    {
        /*Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число1: ");
        int a1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите число2: ");
        int a2 = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите число3: ");
        int a3 = in3.nextInt();
        Array_Class[] array1 = new Array_Class[10];
        array1[0] = new Array_Class(a1);
        array1[1] = new Array_Class(a2);
        array1[2] = new Array_Class(a3);
        for (int i = 0; i < 3; i++)
        {
            System.out.println(array1[i].ArrayClass_Display());
        }*/

        /*double a1 = Math.random()*1000;
        double a2 = Math.random()*1000;
        double a3 = Math.random()*1000;
        Array_Class[] array1 = new Array_Class[10];
        array1[0] = new Array_Class((int)a1);
        array1[1] = new Array_Class((int)a2);
        array1[2] = new Array_Class((int)a3);
        for (int i = 0; i < 3; i++)
        {
            System.out.println(array1[i].ArrayClass_Display());
        }*/

        /*ArrayList<Array_Class> list = new ArrayList<Array_Class>();
        list.add(new Array_Class(135));
        list.add(new Array_Class(312));
        list.add(new Array_Class(286));
        Array_Class max = list.get(0);
        for (Array_Class i : list)
        {
            if(i.intNumber > max.intNumber)
            {
                max = i;
            }
        }
        System.out.println(max.ArrayClass_Display());*/

        /*ArrayList<Array_Class> list = new ArrayList<Array_Class>();
        list.add(new Array_Class(135));
        list.add(new Array_Class(312));
        list.add(new Array_Class(286));
        Array_Class min = list.get(0);
        for (Array_Class i : list)
        {
            if(i.intNumber < min.intNumber)
            {
                min = i;
            }
        }
        System.out.println(min.ArrayClass_Display());*/

        /*ArrayList<Array_Class> list = new ArrayList<Array_Class>();
        list.add(new Array_Class(5));
        list.add(new Array_Class(5));
        list.add(new Array_Class(5));
        int avg1 = 0; int avg2 = 0;
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            avg1 = avg1 + list.get(i1).intNumber;
            avg2 = avg1 / list.size();
        }
        System.out.println(avg2);*/

        ArrayList<Array_Class> list = new ArrayList<Array_Class>();
        list.add(new Array_Class(75));
        list.add(new Array_Class(200));
        list.add(new Array_Class(90));
        list.add(new Array_Class(150));
        list.sort(Comparator.comparing(Array_Class::getNumber));
        for (Array_Class array_class : list)
        {
            System.out.print(array_class.ArrayClass_Display() + " ");
        }
        System.out.print("\n");
        Collections.reverse(list);
        for (Array_Class array_class : list)
        {
            System.out.print(array_class.ArrayClass_Display() + " ");
        }
    }
}