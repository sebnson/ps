def solution(cacheSize, cities):
    total_time = 0
    cache = []

    if cacheSize == 0:
        return 5 * len(cities)
    
    # cache hit
    for city in cities:
        city = city.lower()

        if city in cache:
            total_time += 1
            cache.remove(city)
            cache.append(city)

        # cahce miss
        else:
            total_time += 5
            if len(cache) == cacheSize:
                cache.pop(0)
            cache.append(city)
    
    return total_time
