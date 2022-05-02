package com.github.arthurramonsouza.snakegame.model;

import java.util.LinkedList;

public class Snake {
	
	private LinkedList<Cell> snake = new LinkedList<>();
	private Cell head;
	
	public Snake(Cell initPosition) {
		head = initPosition;
		snake.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}
	
	public void grow() {
		snake.add(head);
	}
	
	public void move(Cell nextCell) {
		System.out.println("Snake is moving to: "
				+ nextCell.getRow() + " "
				+ nextCell.getCol());
		
		Cell tail = snake.removeLast();
		tail.setCellType(CellType.EMPTY);
		
		head = nextCell;
		head.setCellType(CellType.SNAKE_NODE);
		snake.addFirst(head);
		
	}
	
	public boolean checkCrash(Cell nextCell) {
		
		System.out.println("Checking if the next cell is a snake part, if yes, it will be a crash.");
		
		if(nextCell.getCellType() == CellType.SNAKE_NODE) 
			return true;
		else 
			return false;
	}

	public LinkedList<Cell> getSnake()
    {
        return snake;
    }
 
    public void setSnakePartList(LinkedList<Cell> snake) {
        this.snake = snake;
    }
 
    public Cell getHead() { return head; }
 
    public void setHead(Cell head) { this.head = head; }	
}