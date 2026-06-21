import os

PROJECT_DIRECTORY = os.getcwd()
MOD_ID = "beautifulcarpets"
MOD_ASSETS_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/assets/{MOD_ID}"
MOD_DATA_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/data/{MOD_ID}"
MOD_TEXTURES_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/assets/{MOD_ID}/textures/block"

def getMoquetteId(color, ornamentMaterial):
	return f"{MOD_ID}:{color}_{ornamentMaterial}_moquette"

colors = ["red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "purple", "magenta", "pink", "brown", "black", "gray", "light_gray", "white"]
ornamentMaterials = ["gold", "iron", "copper"]

def getBlockstatesJson(color, ornamentMaterial, carpetEnding):
	return f"""{{
	"variants":
	{{
		"": {{ "model": "{MOD_ID}:block/{color}_{ornamentMaterial}_moquette{carpetEnding}" }}
	}}
}}"""

def getBlockModelJson(color, ornamentMaterial, isCarpet):
	return f"""{{
		"parent": "minecraft:block/{'carpet' if isCarpet else 'cube_all'}",
		"textures": {{ "{'wool' if isCarpet else 'all'}": "{MOD_ID}:block/moquette/{ornamentMaterial}/{color}_{ornamentMaterial}_moquette" }}
	}}"""

def getItemModelJson(color, ornamentMaterial, carpetEnding):
	return f"""{{
		"parent": "{MOD_ID}:block/{color}_{ornamentMaterial}_moquette{carpetEnding}"
	}}"""

def getMoquetteCraftJson(color, ornamentMaterial):
	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	"ingredients": [
		{{ "tag": "c:nuggets/{ornamentMaterial}" }},
		{{ "item": "minecraft:{color}_wool" }}
	],
	"result":
	{{
		"count": 1,
		"id": "{getMoquetteId(color, ornamentMaterial)}"
	}}
}}"""

def getMoquetteCarpetCraftJson(color, ornamentMaterial):
	return f"""{{
	"type": "minecraft:crafting_shaped",
	"category": "misc",
	"group": "carpet",
	"key":
	{{
		"#": {{ "item": "{getMoquetteId(color, ornamentMaterial)}" }}
	}},
	"pattern": ["##"],
	"result":
	{{
		"count": 3,
		"id": "{getMoquetteId(color, ornamentMaterial)}_carpet"
	}}
}}"""

def getMoquetteCarpetCraftFromCarpetsJson(color, ornamentMaterial):
	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	"ingredients": [
		{{ "item": "minecraft:{color}_carpet" }},
		{{ "item": "minecraft:{color}_carpet" }},
		{{ "item": "minecraft:{color}_carpet" }},
		{{ "tag": "c:nuggets/{ornamentMaterial}" }},
		{{ "tag": "c:nuggets/{ornamentMaterial}" }}
	],
	"result":
	{{
		"count": 3,
		"id": "{getMoquetteId(color, ornamentMaterial)}_carpet"
	}}
}}"""

def writeToFile(filePath, content):
	with open(filePath, "w", encoding="utf-8") as f:
		f.write(content)

def main():
	counter = 0
	filesCounter = 0

	for color in colors:
		for ornamentMaterial in ornamentMaterials:
			for carpetOrNot in range(2):
				isCarpet = carpetOrNot == 1
				carpetEnding = "_carpet" if isCarpet else ""
				filename = f"{color}_{ornamentMaterial}_moquette{carpetEnding}"

				# Blockstates
				writeToFile(f"{MOD_ASSETS_PATH}/blockstates/{filename}.json", getBlockstatesJson(color, ornamentMaterial, carpetEnding))

				# Block model
				writeToFile(f"{MOD_ASSETS_PATH}/models/block/{filename}.json", getBlockModelJson(color, ornamentMaterial, isCarpet))

				# Item model
				writeToFile(f"{MOD_ASSETS_PATH}/models/item/{filename}.json", getItemModelJson(color, ornamentMaterial, carpetEnding))

				recipeFilePath = f"{MOD_DATA_PATH}/recipe/{filename}.json"

				# Carpets crafts
				if isCarpet:
					writeToFile(recipeFilePath, getMoquetteCarpetCraftJson(color, ornamentMaterial))
					writeToFile(f"{recipeFilePath.replace('.json', '_from_carpets.json')}", getMoquetteCarpetCraftFromCarpetsJson(color, ornamentMaterial))
				# Blocks crafts
				else: writeToFile(recipeFilePath, getMoquetteCraftJson(color, ornamentMaterial))

				counter += 1
				filesCounter += 6

	print(f"Generated data for {counter} items ({filesCounter} files)")

def renameImages():
	counter = 0
	fullCounter = 0

	for ornamentMaterial in ornamentMaterials:
		path = f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}"
		files = [f for f in os.listdir(f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}/") if os.path.isfile(f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}/{f}")]

		for colorIndex in range(len(colors)):
			filename = f"{colors[colorIndex]}_{ornamentMaterial}_moquette.png"

			os.rename(f"{path}/moquette{f'-{colorIndex}' if colorIndex > 0 else ''}.png", f"{path}/{filename}")
			counter += 1

		fullCounter += len(files)

	print(f"Renamed {counter} images (out of {fullCounter})")

main()
renameImages()