FROM websphere-liberty:javaee7
ADD build/libs /modules

RUN cd /modules && \
  ear=$(echo *.ear) && \
  cp $ear /config/dropins/$ear
