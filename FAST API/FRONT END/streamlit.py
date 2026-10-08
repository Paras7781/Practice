#main.py
import streamlit as st
from api_services import *

st.title("📝 Task Manager (FastAPI + Streamlit)")

menu = st.sidebar.selectbox(
    "Choose Action",
    ["Create Task", "View Tasks", "Update Task", "Delete Task"]
)

if menu == "Create Task":
    st.header("Create Task")

    title = st.text_input("Title")
    description = st.text_area("Description")
    priority = st.selectbox("Priority", ["low", "medium", "high"])
    if st.button("Create Task"):
        success = add_task(title, description, priority)

        if success:
            st.success(" Task Created Successfully")
        else:
            st.error(" Failed to create task")


elif menu == "View Tasks":
    st.header("All Tasks")

    tasks = get_tasks()

    if tasks:
        for task in tasks:
            st.subheader(f"Task ID: {task['id']}")
            st.write("Title:", task["title"])
            st.write("Description:", task["description"])
            st.write("Priority:", task["priority"])
            st.write("Completed:", task["completed"])
            st.markdown("---")
    else:
        st.info("No tasks available")


elif menu == "Update Task":
    st.header("Update Task")

    task_id = st.number_input("Task ID", min_value=0, step=1)
    title = st.text_input("New Title")
    description = st.text_area("New Description")
    priority = st.selectbox("Priority", ["low", "medium", "high"])
    completed = st.checkbox("Completed")

    if st.button("Update Task"):
        success = update_task(
            task_id,
            title,
            description,
            priority,
            completed
        )

        if success:
            st.success(" Task Updated Successfully")
        else:
            st.error(" Failed to update task")


elif menu == "Delete Task":
    st.header("Delete Task")

    task_id = st.number_input("Task ID to Delete", min_value=0, step=1)

    if st.button("Delete Task"):
        success = delete_task(task_id)

        if success:
            st.success(" Task Deleted Successfully")
        else:
            st.error(" Failed to delete task")
