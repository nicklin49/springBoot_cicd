# springBoot_cicd

Using springboot(gradle) and circleCI

when commit on master, circleCI can build jar, build docker image and upload to dockerHub

when commit on develop, cicleCI can build jar, build docker image, upload to dockerHub and auto deploy to develop Env.

note: "auto deploy to develop Env" use remote docker. so need to know what run remote docker.


project port is 8086
