cmake_minimum_required(VERSION 3.4.1)

add_library(keys SHARED
            keys.c)

<<<<<<< HEAD
#SET(CMAKE_CXX_FLAGS  "${CMAKE_CXX_FLAGS} -DCMAKE_CXX_STANDARD=17")
=======
# Ensure output .so is linked with 16KB page-size compatibility.
set_target_properties(keys PROPERTIES
    LINK_FLAGS "-Wl,-z,max-page-size=16384 -Wl,-z,common-page-size=16384")
>>>>>>> upstream/master

# Include libraries needed for native-lib lib
target_link_libraries(keys
                      android
                      log)
