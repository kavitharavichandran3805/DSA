# # from datetime import datetime, timedelta

# # def check(data, guess):
# #     processed_id = set()
# #     work_time = {}

# #     # Filter only rooms for work time calculation
# #     for log in data:
# #         current_id = log["id"]
# #         print("The current id is ",current_id)
# #         if current_id in processed_id:
# #             continue
# #         processed_id.add(current_id)

# #         # Filter logs for the current employee
# #         filtered = [e for e in data if e["id"] == current_id]
# #         current_time = timedelta(0)  # Initialize total time for the employee
# #         unmatched_logs = 0  # Track if there are unmatched entry or exit logs

# #         for i in range(0, len(filtered), 2):
# #             if i + 1 >= len(filtered):
# #                 print("Incomplete entry/exit logs (no exit log found)")
# #                 unmatched_logs += 1
# #                 break# Skip this log pair if there is no exit log

# #             entry_log = filtered[i]
# #             exit_log = filtered[i + 1]
# #             print("The entry log is ",entry_log)
# #             print("The exit log is ",exit_log)

# #             # Ensure that both entry and exit logs are from the same room (location)
# #             if entry_log["location"] == exit_log["location"] and entry_log["location"].startswith("room"):
# #                 print("entry and exit both are met")
# #                 time1 = datetime.strptime(entry_log["time"], "%I:%M%p")
# #                 time2 = datetime.strptime(exit_log["time"], "%I:%M%p")

# #                 # Calculate the time spent working in the room
# #                 time_diff = time2 - time1
# #                 current_time += time_diff  # Add the time spent in the room to the employee's total work time
# #             else:
# #                 print("Skip logs if entry and exit are from different locations")
# #                 unmatched_logs += 1

# #         if unmatched_logs > 0:
# #             work_time[current_id] = None  # Mark as incomplete logs
# #         else:
# #             work_time[current_id] = current_time

# #     # Check if the suspect employee's logs are incomplete
# #         print(unmatched_logs)
# #     print(work_time)
# #     if work_time.get(guess) is None:
# #         return "Cannot be determined"

# #     # Find the employee with the least work time, excluding those with incomplete logs
# #     least_time_employee = min((k for k, v in work_time.items() if v is not None), key=lambda k: work_time[k], default=None)
# #     print(least_time_employee)
# #     if least_time_employee == guess:
# #         return "Yes"
# #     else:
# #         return "No"


# # # Input parsing
# # # n = int(input())
# # # data = []

# # # for i in range(n):
# # #     log_entry = input().split()
# # #     entry_dict = {
# # #         "id": int(log_entry[0]),
# # #         "action": log_entry[1],
# # #         "location": log_entry[2],
# # #         "time": log_entry[3]
# # #     }
# # #     data.append(entry_dict)
# # data = [
# #     {"id": 101, "action": "enters", "location": "cafeteria1", "time": "9:01AM"},
# #     {"id": 101, "action": "exits", "location": "cafeteria1", "time": "10:17AM"},
# #     {"id": 154, "action": "enters", "location": "room5", "time": "9:15AM"},
# #     {"id": 153, "action": "exits", "location": "room4", "time": "11:40AM"},
# #     {"id": 153, "action": "enters", "location": "pantry2", "time": "2:00PM"},
# #     {"id": 101, "action": "enters", "location": "room4", "time": "12:01PM"},
# #     {"id": 154, "action": "exits", "location": "room5", "time": "1:05PM"},
# #     {"id": 153, "action": "exits", "location": "pantry2", "time": "4:00PM"},
# #     {"id": 153, "action": "enters", "location": "room4", "time": "10:16AM"},
# #     {"id": 101, "action": "exits", "location": "room4", "time": "1:25PM"}
# # ]

# # guess = int(input())
# # print(check(data, guess))

# from datetime import datetime, timedelta

# def check(data, guess):
#     processed_id = set()
#     work_time = {}

#     # Filter only rooms for work time calculation
#     for log in data:
#         current_id = log["id"]
#         if current_id in processed_id:
#             continue
#         processed_id.add(current_id)

#         # Filter logs for the current employee
#         filtered = [e for e in data if e["id"] == current_id]
#         current_time = timedelta(0)  # Initialize total time for the employee
#         unmatched_logs = 0  # Track if there are unmatched entry or exit logs

#         for i in range(0, len(filtered), 2):
#             if i + 1 >= len(filtered):
#                 # Handle case where there is an unmatched entry log (missing exit log)
#                 unmatched_logs += 1
#                 break  # Skip this log pair if there is no exit log

#             entry_log = filtered[i]
#             exit_log = filtered[i + 1]

#             # Ensure that both entry and exit logs are from the same room (location)
#             if entry_log["location"] == exit_log["location"] and entry_log["location"].startswith("room"):
#                 time1 = datetime.strptime(entry_log["time"], "%I:%M%p")
#                 time2 = datetime.strptime(exit_log["time"], "%I:%M%p")

#                 # Calculate the time spent working in the room
#                 time_diff = time2 - time1
#                 current_time += time_diff  # Add the time spent in the room to the employee's total work time
#             else:
#                 # In case of unmatched locations (entry and exit in different rooms)
#                 unmatched_logs += 1

#         if unmatched_logs > 0:
#             work_time[current_id] = None  # Mark as incomplete logs
#         else:
#             work_time[current_id] = current_time

#     # Check if the suspect employee's logs are incomplete
#     if work_time.get(guess) is None:
#         return "Cannot be determined"

#     # Find the employee with the least work time, excluding those with incomplete logs
#     least_time_employee = min((k for k, v in work_time.items() if v is not None), key=lambda k: work_time[k], default=None)

#     if least_time_employee == guess:
#         return "Yes"
#     else:
#         return "No"


# # Sample Data Input
# data = [
#     {"id": 101, "action": "enters", "location": "cafeteria1", "time": "9:01AM"},
#     {"id": 101, "action": "exits", "location": "cafeteria1", "time": "10:17AM"},
#     {"id": 154, "action": "enters", "location": "room5", "time": "9:15AM"},
#     {"id": 153, "action": "exits", "location": "room4", "time": "11:40AM"},
#     {"id": 153, "action": "enters", "location": "pantry2", "time": "2:00PM"},
#     {"id": 101, "action": "enters", "location": "room4", "time": "12:01PM"},
#     {"id": 154, "action": "exits", "location": "room5", "time": "1:05PM"},
#     {"id": 153, "action": "exits", "location": "pantry2", "time": "4:00PM"},
#     {"id": 153, "action": "enters", "location": "room4", "time": "10:16AM"},
#     {"id": 101, "action": "exits", "location": "room4", "time": "1:25PM"}
# ]


# guess = 153
# print(check(data, guess))

from datetime import datetime, timedelta

# def check(data, guess):
#     processed_id = set()
#     work_time = {}

#     # Filter only rooms for work time calculation
#     for log in data:
#         current_id = log["id"]
#         if current_id in processed_id:
#             continue
#         processed_id.add(current_id)

#         # Filter logs for the current employee
#         filtered = [e for e in data if e["id"] == current_id]
#         current_time = timedelta(0)  # Initialize total time for the employee
#         unmatched_logs = 0  # Track if there are unmatched entry or exit logs

#         for i in range(0, len(filtered), 2):
#             if filtered[0]["action"]=="exit":
#                 print("the first action is exit")
#                 current_time=datetime.strptime(filtered[0]["time"], "%I:%M%p")
#                 i+=1
#                 continue
#             if i + 1 >= len(filtered):
#                 if filtered[i]["action"]=='entry':
#                     break
#                 else:
#                     print("inside the i+1 else and the current id is ",current_id)
#                     unmatched_logs += 1
#                     break  # Skip this log pair if there is no exit log

#             entry_log = filtered[i]
#             exit_log = filtered[i + 1]

#             # Ensure that both entry and exit logs are from the same room (location)
#             if entry_log["location"] == exit_log["location"] and entry_log["location"].startswith("room"):
#                 print("Current id ",current_id)
#                 print(entry_log["location"])
#                 print(exit_log["location"])
#                 time1 = datetime.strptime(entry_log["time"], "%I:%M%p")
#                 time2 = datetime.strptime(exit_log["time"], "%I:%M%p")

#                 # Calculate the time spent working in the room
#                 time_diff = time2 - time1
#                 current_time += time_diff  # Add the time spent in the room to the employee's total work time
#             else:
#                 print("inside the entry and exit condition else part and the current id is ",current_id)
#                 unmatched_logs += 1

#         # If the employee has unmatched logs, mark them as None (incomplete)
#         if unmatched_logs > 0:
#             work_time[current_id] = None
#         else:
#             work_time[current_id] = current_time
#     print(work_time)
#     if work_time.get(guess) is None:
#         return "Cannot be determined"

#     # Find the employee with the least work time, excluding those with incomplete logs
#     least_time_employee = min((k for k, v in work_time.items() if v is not None), key=lambda k: work_time[k], default=None)

#     if least_time_employee == guess:
#         return "Yes"
#     else:
#         return "No"
from datetime import datetime, timedelta

from datetime import datetime, timedelta

def check(data, guess):
    processed_id = set()
    work_time = {}

    for log in data:
        current_id = log["id"]
        if current_id in processed_id:
            continue
        processed_id.add(current_id)

        # Filter logs for the current employee and sort by time
        filtered = sorted(
            [e for e in data if e["id"] == current_id],
            key=lambda x: datetime.strptime(x["time"], "%I:%M%p")
        )
        
        current_time = timedelta(0)
        room_entries = {}  # Track room entries by location

        # Process each log entry sequentially
        for log in filtered:
            if not log["location"].startswith("room"):
                continue

            time = datetime.strptime(log["time"], "%I:%M%p")
            
            if log["action"] == "enters":
                room_entries[log["location"]] = time
            else:  # exits
                entry_time = room_entries.get(log["location"])
                if entry_time and entry_time < time:
                    current_time += time - entry_time
                room_entries[log["location"]] = None

        work_time[current_id] = current_time if current_time > timedelta(0) else None

    # If the guess has no valid work time
    if work_time.get(guess) is None:
        return "Cannot be determined"

    # Get valid work times (excluding None values)
    valid_times = {k: v for k, v in work_time.items() if v is not None}
    
    if not valid_times:
        return "Cannot be determined"

    # Find minimum work time
    min_time = min(valid_times.values())
    min_time_employees = [emp_id for emp_id, time in valid_times.items() if time == min_time]

    # If multiple employees have the minimum time
    if len(min_time_employees) > 1:
        return "Cannot be determined"
    
    return "Yes" if guess in min_time_employees else "No"
# Example input
data = [
    {"id": 101, "action": "enters", "location": "cafeteria1", "time": "9:01AM"},
    {"id": 101, "action": "exits", "location": "cafeteria1", "time": "10:17AM"},
    {"id": 154, "action": "enters", "location": "room5", "time": "9:15AM"},
    {"id": 153, "action": "exits", "location": "room4", "time": "11:40AM"},
    {"id": 153, "action": "enters", "location": "pantry2", "time": "2:00PM"},
    {"id": 101, "action": "enters", "location": "room4", "time": "12:01PM"},
    {"id": 154, "action": "exits", "location": "room5", "time": "1:05PM"},
    {"id": 153, "action": "exits", "location": "pantry2", "time": "4:00PM"},
    {"id": 153, "action": "enters", "location": "room4", "time": "10:16AM"},
    {"id": 101, "action": "exits", "location": "room4", "time": "1:25PM"}
]

guess = 153  # Change to any employee id for testing
print(check(data, guess))  # Output should be "Yes" if it's the employee with the least time
