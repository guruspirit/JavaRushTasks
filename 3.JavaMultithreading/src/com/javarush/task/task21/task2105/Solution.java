package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public int hashCode() {
        return 31*(first==null? 0 : first.hashCode())+(last==null? 0 : last.hashCode());
    }

    public boolean equals(Object o) {
        if (!(o instanceof Solution))
            return false;
        if (o==this)
            return true;
        if (o==null || o.getClass()!=this.getClass())
            return false;
        Solution n = (Solution) o;
        //if (this.first==null||this.last==null||n.first==null||n.last==null)
        //    return false;
        return (n.first==first || (n.first!=null&& n.first.equals(first))) && (n.last==last || (n.last!=null && n.last.equals(last)));
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
