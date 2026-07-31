# Kth Largest Element in an Array

## Problem

Given an integer array `nums` and an integer `k`, return the **kth largest element** in the array.

---

## Approach

- Store all elements in a `LinkedList`.
- Sort the list in **descending order** using `Collections.reverseOrder()`.
- Return the element at index `k - 1`.

---

## Time Complexity

O(n log n)

---

## Space Complexity

O(n)

---

## Java Concepts Used

- LinkedList
- Collections.sort()
- Collections.reverseOrder()

---

## LeetCode

https://leetcode.com/problems/kth-largest-element-in-an-array/