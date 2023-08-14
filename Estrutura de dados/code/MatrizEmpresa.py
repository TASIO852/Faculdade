#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Created on Thu Jan 23 17:13:16 2020
@author: rafael
"""

# Programa Python recursivo para passagem de nível de nível da árvore binária

# Estrutura do nó da árvore


class Node:
    # função para criar um novo nó
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None

# Função para imprimir a ordem de nível da árvore


def printLevelOrder(root):
    h = height(root)
    for i in range(1, h+1):
        printGivenLevel(root, i)

# Imprimir nós em um determinado nível


def printGivenLevel(root, level):
    if root is None:
        return
    if level == 1:
        print("%d =>" % (root.data))
    elif level > 1:
        printGivenLevel(root.left, level-1)
        printGivenLevel(root.right, level-1)


""" Calcular a altura de uma árvore - o número de nós
ao longo do caminho mais longo, do nó raiz até o
o nó da folha mais distante
"""


def height(node):
    if node is None:
        return 0
    else:
        # Calcular a altura de cada subárvore
        lheight = height(node.left)
        rheight = height(node.right)
        # Use o maior
        if lheight > rheight:
            return lheight+1
        else:
            return rheight+1


# Teste das funções
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

print("Percurso da ordem de nível da matriz da empresa:")
printLevelOrder(root)
