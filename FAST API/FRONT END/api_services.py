#api_services.py
import requests

API_URL = "http://127.0.0.1:8000"


def get_tasks():
    try:
        res = requests.get(f"{API_URL}/tasks")
        res.raise_for_status()
        return res.json()
    except Exception as e:
        print("GET Error:", e)
        return []


def add_task(title, description, priority):
    try:
        data = {
            "title": title,
            "description": description,
            "priority": priority,
            "completed": False
        }

        res = requests.post(f"{API_URL}/tasks", json=data)
        res.raise_for_status()
        return True

    except Exception as e:
        print("ADD Error:", e)
        return False


def delete_task(task_id):
    try:
        res = requests.delete(f"{API_URL}/tasks/{task_id}")
        res.raise_for_status()
        return True

    except Exception as e:
        print("DELETE Error:", e)
        return False


def update_task(task_id, title, description, priority,completed):
    try:
        data = {
            "title": title,
            "description": description,
            "priority": priority,
            "completed": completed
        }

        res = requests.put(f"{API_URL}/tasks/{task_id}", json=data)
        res.raise_for_status()
        return True

    except Exception as e:
        print("UPDATE Error:", e)
        return False

