import os

PROJECT_DIRECTORY = os.getcwd()
MOD_ID = "beautifulcarpets"
MOD_ASSETS_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/assets/{MOD_ID}"
MOD_DATA_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/data/{MOD_ID}"
MINECRAFT_DATA_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/data/minecraft"
MOD_TEXTURES_PATH = f"{PROJECT_DIRECTORY}/src/main/resources/assets/{MOD_ID}/textures/block"

def getVelvetName(color, isFaded):
	return f"{color}_velvet{'_faded' if isFaded else ''}"

def getVelvetId(color, isFaded):
	return f"{MOD_ID}:{getVelvetName(color, isFaded)}"

def getMoquetteName(color, ornamentMaterial, isFaded):
	return f"{color}_{ornamentMaterial}_moquette{'_faded' if isFaded else ''}"

def getMoquetteId(color, ornamentMaterial, isFaded):
	return f"{MOD_ID}:{getMoquetteName(color, ornamentMaterial, isFaded)}"

colors = ["red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "purple", "magenta", "pink", "brown", "black", "gray", "light_gray", "white"]
ornamentMaterials = ["gold", "iron", "copper"]

def getBlockstatesJson(isMoquette, color, ornamentMaterial, isFaded, carpetEnding):
	return f"""{{
	"variants":
	{{
		"": {{ "model": "{MOD_ID}:block/{getMoquetteName(color, ornamentMaterial, isFaded) if isMoquette else getVelvetName(color, isFaded)}{carpetEnding}" }}
	}}
}}"""

def getBlockModelJson(isMoquette, color, ornamentMaterial, isFaded, isCarpet):
	result = '''{
	'''
	result += f'''"parent": "minecraft:block/{'carpet' if isCarpet else 'cube_all'}",
	'''
	result += '"textures": { "'
	result += f"""{'wool' if isCarpet else 'all'}": "{MOD_ID}:block/"""

	if isMoquette:
		result += f"""moquette{'_faded' if isFaded else ''}/{ornamentMaterial}/{getMoquetteName(color, ornamentMaterial, isFaded)}"""
	else:
		result += f"""velvet{'_faded' if isFaded else ''}/{getVelvetName(color, isFaded)}"""

	result += '''" }
}'''
	return result

def getItemModelJson(isMoquette, color, ornamentMaterial, isFaded, carpetEnding):
	return f"""{{
	"parent": "{MOD_ID}:block/{getMoquetteName(color, ornamentMaterial, isFaded) if isMoquette else getVelvetName(color, isFaded)}{carpetEnding}"
}}"""

def getMoquetteCraftJson(color, ornamentMaterial, isFaded):
	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "wool",
	"ingredients": [
		{f'{{ "item": "{getMoquetteId(color, ornamentMaterial, False)}" }}'
		if isFaded
		else f'''{{ "tag": "c:nuggets/{ornamentMaterial}" }},
		{{ "item": "minecraft:{color}_wool" }}'''}
	],
	"result":
	{{
		"count": 1,
		"id": "{getMoquetteId(color, ornamentMaterial, isFaded)}"
	}}
}}"""

def getVelvetCraftJson(color, isFaded):
	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "wool",
	"ingredients": [
		{f'{{ "item": "{getVelvetId(color, False)}" }}'
		if isFaded
		else f'{{ "item": "minecraft:{color}_wool" }}'}
	],
	"result":
	{{
		"count": 1,
		"id": "{getVelvetId(color, isFaded)}"
	}}
}}"""

def getMoquetteCarpetCraftJson(color, ornamentMaterial, isFaded):
	return f"""{{
	"type": "minecraft:crafting_shape{'less' if isFaded else 'd'}",
	"category": "misc",
	"group": "carpet",
	{
		f'''"ingredients": [
		{{ "item": "{getMoquetteId(color, ornamentMaterial, False)}_carpet" }}
	],'''
		if isFaded
		else f'''"key":
	{{
		"#": {{ "item": "{getMoquetteId(color, ornamentMaterial, isFaded)}" }}
	}},
	"pattern": ["##"],'''}
	"result":
	{{
		"count": {'1' if isFaded else '3'},
		"id": "{getMoquetteId(color, ornamentMaterial, isFaded)}_carpet"
	}}
}}"""

def getVelvetCarpetCraftJson(color, isFaded):
	return f"""{{
	"type": "minecraft:crafting_shapeless",
	"category": "misc",
	"group": "carpet",
	{
		f'''"ingredients": [
		{{ "item": "{getVelvetId(color, False)}_carpet" }}
	],'''
		if isFaded
		else f'''"key":
	{{
		"#": {{ "item": "{getVelvetId(color, isFaded)}" }}
	}},
	"pattern": ["##"],'''}
	"result":
	{{
		"count": 1,
		"id": "{getVelvetId(color, isFaded)}_carpet"
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
		"id": "{getMoquetteId(color, ornamentMaterial, False)}_carpet"
	}}
}}"""

def getVanillaWoolTagFullJson():
	json = """{
	"values": [
"""

	for colorIndex in range(len(colors)):
		for ornamentMaterialIndex in range(len(ornamentMaterials)):
			json += f'''		"{getMoquetteId(colors[colorIndex], ornamentMaterials[ornamentMaterialIndex], False)}",
'''
			json += f'''		"{getMoquetteId(colors[colorIndex], ornamentMaterials[ornamentMaterialIndex], True)}",
'''
		json += f'''		"{getVelvetId(colors[colorIndex], False)}",
'''
		json += f'''		"{getVelvetId(colors[colorIndex], True)}"{',' if colorIndex != len(colors) - 1 else ''}
'''

	json += """	]
}"""

	return json

def getVanillaWoolCarpetsTagFullJson():
	json = """{
	"values": [
"""

	for colorIndex in range(len(colors)):
		for ornamentMaterialIndex in range(len(ornamentMaterials)):
			json += f'''		"{getMoquetteId(colors[colorIndex], ornamentMaterials[ornamentMaterialIndex], False)}_carpet",
'''
			json += f'''		"{getMoquetteId(colors[colorIndex], ornamentMaterials[ornamentMaterialIndex], True)}_carpet",
'''
		json += f'''		"{getVelvetId(colors[colorIndex], False)}_carpet",
'''
		json += f'''		"{getVelvetId(colors[colorIndex], True)}_carpet"{',' if colorIndex != len(colors) - 1 else ''}
'''

	json += """	]
}"""

	return json

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
				filenameMoquette = f"{getMoquetteName(color, ornamentMaterial, False)}{carpetEnding}"
				filenameMoquetteFaded = f"{getMoquetteName(color, ornamentMaterial, True)}{carpetEnding}"
				filenameVelvet = f"{getVelvetName(color, False)}{carpetEnding}"
				filenameVelvetFaded  = f"{getVelvetName(color, True)}{carpetEnding}"

				# Blockstates
				writeToFile(f"{MOD_ASSETS_PATH}/blockstates/{filenameMoquette}.json", getBlockstatesJson(True, color, ornamentMaterial, False, carpetEnding))
				writeToFile(f"{MOD_ASSETS_PATH}/blockstates/{filenameMoquetteFaded}.json", getBlockstatesJson(True, color, ornamentMaterial, True, carpetEnding))
				filesCounter += 2

				if ornamentMaterial == ornamentMaterials[0]:
					writeToFile(f"{MOD_ASSETS_PATH}/blockstates/{filenameVelvet}.json", getBlockstatesJson(False, color, ornamentMaterial, False, carpetEnding))
					writeToFile(f"{MOD_ASSETS_PATH}/blockstates/{filenameVelvetFaded}.json", getBlockstatesJson(False, color, ornamentMaterial, True, carpetEnding))
					filesCounter += 2

				# Block model
				writeToFile(f"{MOD_ASSETS_PATH}/models/block/{filenameMoquette}.json", getBlockModelJson(True, color, ornamentMaterial, False, isCarpet))
				writeToFile(f"{MOD_ASSETS_PATH}/models/block/{filenameMoquetteFaded}.json", getBlockModelJson(True, color, ornamentMaterial, True, isCarpet))
				filesCounter += 2

				if ornamentMaterial == ornamentMaterials[0]:
					writeToFile(f"{MOD_ASSETS_PATH}/models/block/{filenameVelvet}.json", getBlockModelJson(False, color, ornamentMaterial, False, isCarpet))
					writeToFile(f"{MOD_ASSETS_PATH}/models/block/{filenameVelvetFaded}.json", getBlockModelJson(False, color, ornamentMaterial, True, isCarpet))
					filesCounter += 2

				# Item model
				writeToFile(f"{MOD_ASSETS_PATH}/models/item/{filenameMoquette}.json", getItemModelJson(True, color, ornamentMaterial, False, carpetEnding))
				writeToFile(f"{MOD_ASSETS_PATH}/models/item/{filenameMoquetteFaded}.json", getItemModelJson(True, color, ornamentMaterial, True, carpetEnding))
				filesCounter += 2

				if ornamentMaterial == ornamentMaterials[0]:
					writeToFile(f"{MOD_ASSETS_PATH}/models/item/{filenameVelvet}.json", getItemModelJson(False, color, ornamentMaterial, False, carpetEnding))
					writeToFile(f"{MOD_ASSETS_PATH}/models/item/{filenameVelvetFaded}.json", getItemModelJson(False, color, ornamentMaterial, True, carpetEnding))
					filesCounter += 2

				recipeFilePathMoquette = f"{MOD_DATA_PATH}/recipe/{filenameMoquette}.json"
				recipeFilePathMoquetteFaded = f"{MOD_DATA_PATH}/recipe/{filenameMoquetteFaded}.json"
				recipeFilePathVelvet = f"{MOD_DATA_PATH}/recipe/{filenameVelvet}.json"
				recipeFilePathVelvetFaded = f"{MOD_DATA_PATH}/recipe/{filenameVelvetFaded}.json"
				filesCounter += 4

				# Carpets crafts
				if isCarpet:
					writeToFile(recipeFilePathMoquette, getMoquetteCarpetCraftJson(color, ornamentMaterial, False))
					writeToFile(recipeFilePathMoquetteFaded, getMoquetteCarpetCraftJson(color, ornamentMaterial, True))
					writeToFile(f"{recipeFilePathMoquette.replace('.json', '_from_carpets.json')}", getMoquetteCarpetCraftFromCarpetsJson(color, ornamentMaterial))
					counter += 3

					if ornamentMaterial == ornamentMaterials[0]:
						writeToFile(recipeFilePathVelvet, getVelvetCarpetCraftJson(color, False))
						writeToFile(recipeFilePathVelvetFaded, getVelvetCarpetCraftJson(color, True))
						counter += 2
				# Blocks crafts
				else:
					writeToFile(recipeFilePathMoquette, getMoquetteCraftJson(color, ornamentMaterial, False))
					writeToFile(recipeFilePathMoquetteFaded, getMoquetteCraftJson(color, ornamentMaterial, True))
					counter += 2

					if ornamentMaterial == ornamentMaterials[0]:
						writeToFile(recipeFilePathVelvet, getVelvetCraftJson(color, False))
						writeToFile(recipeFilePathVelvetFaded, getVelvetCraftJson(color, True))
						counter += 2

	vanillaWoolTagFullJson = getVanillaWoolTagFullJson()
	vanillaWoolCarpetsTagFullJson = getVanillaWoolCarpetsTagFullJson()

	writeToFile(f"{MINECRAFT_DATA_PATH}/tags/block/wool.json", vanillaWoolTagFullJson)
	writeToFile(f"{MINECRAFT_DATA_PATH}/tags/item/wool.json", vanillaWoolTagFullJson)

	writeToFile(f"{MINECRAFT_DATA_PATH}/tags/block/wool_carpets.json", vanillaWoolCarpetsTagFullJson)
	writeToFile(f"{MINECRAFT_DATA_PATH}/tags/item/wool_carpets.json", vanillaWoolCarpetsTagFullJson)

	filesCounter += 4

	print(f"Generated data for {counter} items ({filesCounter} files total)")

def renameImages():
	counter = 0
	fullCounter = 0

	for ornamentMaterial in ornamentMaterials:
		path = f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}"
		pathFaded = f"{MOD_TEXTURES_PATH}/moquette_faded/{ornamentMaterial}"
		files = [f for f in os.listdir(f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}/") if os.path.isfile(f"{MOD_TEXTURES_PATH}/moquette/{ornamentMaterial}/{f}")]
		filesFaded = [f for f in os.listdir(f"{MOD_TEXTURES_PATH}/moquette_faded/{ornamentMaterial}/") if os.path.isfile(f"{MOD_TEXTURES_PATH}/moquette_faded/{ornamentMaterial}/{f}")]

		for colorIndex in range(len(colors)):
			filename = f"{getMoquetteName(colors[colorIndex], ornamentMaterial, False)}.png"
			filenameFaded = f"{getMoquetteName(colors[colorIndex], ornamentMaterial, True)}.png"

			oldFilepath = f"{path}/moquette{f'-{colorIndex}' if colorIndex > 0 else ''}.png"
			oldFilepathFaded = f"{pathFaded}/moquette_faded{f'-{colorIndex}' if colorIndex > 0 else ''}.png"

			if os.path.isfile(oldFilepath):
				os.rename(oldFilepath, f"{path}/{filename}")

			if os.path.isfile(oldFilepathFaded):
				os.rename(oldFilepathFaded, f"{pathFaded}/{filenameFaded}")

			counter += 2

		fullCounter += len(files) + len(filesFaded)

	for colorIndex in range(len(colors)):
		path = f"{MOD_TEXTURES_PATH}/velvet"
		pathFaded = f"{MOD_TEXTURES_PATH}/velvet_faded"
		files = [f for f in os.listdir(f"{MOD_TEXTURES_PATH}/velvet/") if os.path.isfile(f"{MOD_TEXTURES_PATH}/velvet/{f}")]
		filesFaded = [f for f in os.listdir(f"{MOD_TEXTURES_PATH}/velvet_faded/") if os.path.isfile(f"{MOD_TEXTURES_PATH}/velvet_faded/{f}")]

		for colorIndex in range(len(colors)):
			filename = f"{getVelvetName(colors[colorIndex], False)}.png"
			filenameFaded = f"{getVelvetName(colors[colorIndex], True)}.png"

			oldFilepath = f"{path}/velvet{f'-{colorIndex}' if colorIndex > 0 else ''}.png"
			oldFilepathFaded = f"{pathFaded}/velvet_faded{f'-{colorIndex}' if colorIndex > 0 else ''}.png"

			if os.path.isfile(oldFilepath):
				os.rename(oldFilepath, f"{path}/{filename}")

			if os.path.isfile(oldFilepathFaded):
				os.rename(oldFilepathFaded, f"{pathFaded}/{filenameFaded}")

			counter += 2

		fullCounter += len(files) + len(filesFaded)

	print(f"Renamed {counter} images (out of {fullCounter})")

main()
renameImages()