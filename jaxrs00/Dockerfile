FROM websphere-liberty:javaee7
ADD build/libs /modules

RUN cd /modules && \
  war=$(echo *.war) && \
  cp $war /config/dropins/$war
