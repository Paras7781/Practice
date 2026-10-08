#app.py
from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()
tasks = []

@app.get("/")
def home():
    return "Hello"

class Task(BaseModel):
    title: str
    description: str
    priority: str = "low"
    due_date: str = ""
    completed: bool = False

@app.post("/tasks")
def createTask(task: Task):
    task_dict = task.dict()
    task_dict["id"] = len(tasks)  
    tasks.append(task_dict)
    return {"message": "task added successfully", "task": task_dict}

@app.get("/tasks")
def getTasks():
    return tasks

@app.put("/tasks/{task_id}")
def updateTask(task: Task, task_id: int):   
    if task_id < 0 or task_id >= len(tasks): 
        return {"error": "task not found"}
    task_dict = task.dict()
    task_dict["id"] = task_id
    tasks[task_id] = task_dict        
    return {"message": "task updated successfully", "task": task_dict}

@app.delete("/tasks/{task_id}")
def deleteTask(task_id: int):
    if task_id < 0 or task_id >= len(tasks):  
        return {"message": "invalid selection"}
    deleted = tasks.pop(task_id)     
    return {"message": "task deleted", "task": deleted}