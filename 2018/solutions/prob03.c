#include <stdio.h>

int main(int argc, char **argv)
{
    double srv_hours, srv_rate, stor_gb, stor_rate, bw, bw_rate;
    double srv_cost, stor_cost, bw_cost, total_cost;

    while (scanf("%lf %lf %lf %lf %lf %lf", &srv_hours, &srv_rate,
                 &stor_gb, &stor_rate, &bw, &bw_rate) == 6) {
        srv_cost = srv_hours * srv_rate;
        stor_cost = stor_gb * stor_rate;
        bw_cost = bw * bw_rate;

        total_cost = srv_cost + stor_cost + bw_cost;

        printf("%.2f\n", total_cost);
    }
    return 0;
}
