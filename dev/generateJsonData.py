startPath = ""

colors = ["red", "orange", "yellow", "olive", "green", "seagreen", "emerald", "aquamarine", "blue", "cobaltblue", "midnight", "violet", "purple", "orchid", "black", "gray"]
colorTypes = ["gold", "silver", "copper"]
carpetTypes = ["", "_carpet"]

for color in colors:
    for colorType in colorTypes:
        for carpetType in carpetTypes:

            json1 = f"""{{
	"variants":
	{{
		"":
		{{
			"model": "beautifulcarpets:block/{color}_{colorType}_moquette{carpetType}"
		}}
	}}
}}"""

            json2 = f"""{{
	"parent": "minecraft:block/{'cube_all' if carpetType == "" else 'carpet'}",
	"textures":
	{{
		"{'all' if carpetType == "" else 'wool'}": "beautifulcarpets:block/{color}_{colorType}_moquette"
	}}
}}"""

            json3 = f"""{{
	"parent": "beautifulcarpets:block/{color}_{colorType}_moquette{carpetType}"
}}"""

            f = open(f"{startPath}\\BeautifulCarpets\\src\\main\\resources\\assets\\beautifulcarpets\\blockstates\\{color}_{colorType}_moquette{carpetType}.json", "w", encoding="utf-8")
            f.write(json1)
            f.close()

            f = open(f"{startPath}\\BeautifulCarpets\\src\\main\\resources\\assets\\beautifulcarpets\\models\\block\\{color}_{colorType}_moquette{carpetType}.json", "w", encoding="utf-8")
            f.write(json2)
            f.close()

            f = open(f"{startPath}\\BeautifulCarpets\\src\\main\\resources\\assets\\beautifulcarpets\\models\\item\\{color}_{colorType}_moquette{carpetType}.json", "w", encoding="utf-8")
            f.write(json3)
            f.close()