import mpmath

goal = """
17  16  15  14  13
18   5   4   3  12
19   6   1   2  11
20   7   8   9  10
21  22  23  24 ..."""


def change_direction(direction):
    if direction == "UP":
        return "LEFT"
    if direction == "LEFT":
        return "DOWN"
    if direction == "DOWN":
        return "RIGHT"
    if direction == "RIGHT":
        return "UP"


coordinates = {}
square_size = 1
square_x_y = 1
new_square = False
direction = ""
x = 0
y = 0
accum = 0
directions = ["UP", "LEFT", "DOWN", "RIGHT"]

# for i in range(1, 347992):
#     # print("i: {0}".format(i))
#     # print("square_size: {0}".format(square_size))
#     # print("square_x_y: {0}".format(square_x_y))
#     # print("direction: {0}".format(direction))
#     # print("(x, y): ({0},{1})".format(x, y))
#     # print("accum: {0}".format(accum))
#     coordinates[i] = (x, y)
#     # print("coordinates: {0}".format(coordinates))
#
#     if i == square_size:
#         square_x_y = mpmath.sqrt(square_size) + 2
#         square_size = mpmath.power(square_x_y, 2)
#         new_square = True
#
#     if not new_square:
#         accum = accum + 1
#         if accum == (square_x_y - 1):
#             direction = change_direction(direction)
#             accum = 0
#         if direction == "UP":
#             y = y + 1
#         if direction == "LEFT":
#             x = x - 1
#         if direction == "DOWN":
#             y = y - 1
#         if direction == "RIGHT":
#             x = x + 1
#
#     if new_square:
#         direction = "RIGHT"
#         new_square = False
#         x = x + 1
#         direction = "UP"
#         accum = 0
#
#
# final_coordinates = coordinates[347991]
# final_x = final_coordinates[0]
# final_y = final_coordinates[1]
# distance = mpmath.fabs(final_x) + mpmath.fabs(final_y)
# print("coordinates[347991]: {0}".format(final_coordinates))
# print("final x: {0}".format(final_x))
# print("final y: {0}".format(final_y))
# print("distinace: {0}".format(distance))

goal2 = """
147  142  133  122   59
304    5    4    2   57
330   10    1    1   54
351   11   23   25   26
362  747  806--->   ..."""
value = 1


def check_square(coords):
    val = 0
    vals = []
    if bool(coords):
        current_index = coords.popitem()
        # print("popitem: {0}".format(current_index))
        current_x = current_index[1][0]
        current_y = current_index[1][1]
        # print("current_coordinates: ({0}, {1})".format(current_x, current_y))
        neighbor1_coords = (current_x - 1, current_y)
        neighbor2_coords = (current_x - 1, current_y - 1)
        neighbor3_coords = (current_x, current_y - 1)
        neighbor4_coords = (current_x + 1, current_y - 1)
        neighbor5_coords = (current_x + 1, current_y)
        neighbor6_coords = (current_x + 1, current_y + 1)
        neighbor7_coords = (current_x, current_y + 1)
        neighbor8_coords = (current_x - 1, current_y + 1)

        # print("neighbor1_coords: {0}".format(neighbor1_coords))
        # print("neighbor2_coords: {0}".format(neighbor2_coords))
        # print("neighbor3_coords: {0}".format(neighbor3_coords))
        # print("neighbor4_coords: {0}".format(neighbor4_coords))
        # print("neighbor5_coords: {0}".format(neighbor5_coords))
        # print("neighbor6_coords: {0}".format(neighbor6_coords))
        # print("neighbor7_coords: {0}".format(neighbor7_coords))
        # print("neighbor8_coords: {0}".format(neighbor8_coords))


        if neighbor1_coords in coords:
            # print("neighbor1_coords in coords")
            vals.append(coords.get(neighbor1_coords)[2])
        if neighbor2_coords in coords:
            # print("neighbor2_coords in coords")
            vals.append(coords.get(neighbor2_coords)[2])
        if neighbor3_coords in coords:
            # print("neighbor3_coords in coords")
            vals.append(coords.get(neighbor3_coords)[2])
        if neighbor4_coords in coords:
            # print("neighbor4_coords in coords")
            vals.append(coords.get(neighbor4_coords)[2])
        if neighbor5_coords in coords:
            # print("neighbor5_coords in coords")
            vals.append(coords.get(neighbor5_coords)[2])
        if neighbor6_coords in coords:
            # print("neighbor6_coords in coords")
            vals.append(coords.get(neighbor6_coords)[2])
        if neighbor7_coords in coords:
            # print("neighbor7_coords in coords")
            vals.append(coords.get(neighbor7_coords)[2])
        if neighbor8_coords in coords:
            # print("neighbor8_coords in coords")
            vals.append(coords.get(neighbor8_coords)[2])
        if len(vals) == 0:
            val = 1
        else:
            val = sum(vals)
    return val


for i in range(1, 347991):
    # print("i: {0}".format(i))
    # print("square_size: {0}".format(square_size))
    # print("square_x_y: {0}".format(square_x_y))
    # print("direction: {0}".format(direction))
    # print("(x, y): ({0},{1})".format(x, y))
    # print("accum: {0}".format(accum))
    coordinates[(x, y)] = (x, y, i)
    new_value = check_square(coordinates)
    if new_value > 347991:
        print("new_value: {0}".format(new_value))
        exit(0)
    coordinates[(x, y)] = (x, y, new_value)
    # print("coordinates: {0}".format(coordinates))

    if i == square_size:
        square_x_y = mpmath.sqrt(square_size) + 2
        square_size = mpmath.power(square_x_y, 2)
        new_square = True

    if not new_square:
        accum = accum + 1
        if accum == (square_x_y - 1):
            direction = change_direction(direction)
            accum = 0
        if direction == "UP":
            y = y + 1
        if direction == "LEFT":
            x = x - 1
        if direction == "DOWN":
            y = y - 1
        if direction == "RIGHT":
            x = x + 1

    if new_square:
        direction = "RIGHT"
        new_square = False
        x = x + 1
        direction = "UP"
        accum = 0

# final_coordinates = coordinates[347991]
# final_x = final_coordinates[0]
# final_y = final_coordinates[1]
# distance = mpmath.fabs(final_x) + mpmath.fabs(final_y)
# print("coordinates[347991]: {0}".format(final_coordinates))
# print("final x: {0}".format(final_x))
# print("final y: {0}".format(final_y))
# print("distinace: {0}".format(distance))
